package miniems.data;

import java.util.Map;
import miniems.channel.ChannelId;

public class ComponentData {

    private final String id;
    private final Map<ChannelId, Integer> channels;

    public ComponentData(String id, Map<ChannelId, Integer> channels) {
        this.id = id;
        this.channels = channels;
    }

    public String getId() {
        return this.id;
    }

    public Map<ChannelId, Integer> getChannels() {
        return this.channels;
    }
}