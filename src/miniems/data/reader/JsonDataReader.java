package miniems.data.reader;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import miniems.data.ComponentData;
import miniems.data.InputData;
import miniems.data.reader.api.DataReader;

import miniems.channel.ChannelId;

public class JsonDataReader implements DataReader {
    
    private final JsonArray data;
    private int currentIndex;
    
    @Override
    public InputData readNext() {
        if (this.currentIndex >= this.data.size()) {
            return null;
        }
        
        JsonObject jsonObject = this.data.get(this.currentIndex).getAsJsonObject();
        this.currentIndex++;
        
        int id = jsonObject.get("id").getAsInt();

        LocalDateTime datetime = LocalDateTime.parse(
            jsonObject.get("datetime").getAsString(),
            DateTimeFormatter.ISO_LOCAL_DATE_TIME
        );
        
        JsonObject componentsObject = jsonObject.getAsJsonObject("components");
        Map<String, ComponentData> components = new HashMap<>();
        
        for (Map.Entry<String, JsonElement> entry : componentsObject.entrySet()) {
            String componentName = entry.getKey();
            JsonObject componentObject = entry.getValue().getAsJsonObject();
            
            String componentId = componentObject.get("id").getAsString();
            JsonObject channelsObject = componentObject.getAsJsonObject("channels");
            
            Map<ChannelId, Integer> channels = new HashMap<>();
            
            for (Entry<String, JsonElement> channelEntry : channelsObject.entrySet()) {
                ChannelId channelId = ChannelId.valueOf(channelEntry.getKey());
                int value = channelEntry.getValue().getAsInt();
                channels.put(channelId, value);
            }
            
            ComponentData componentData = new ComponentData(componentId, channels);
            components.put(componentName, componentData);
            
        }
        
        return new InputData(id, datetime, components);
    }
    
    public JsonDataReader() throws IOException {
        this.data = JsonParser.parseReader(
                new FileReader("data/input/data.json")
        ).getAsJsonArray();
    }
    
}
