package miniems.data;

import java.time.LocalDateTime;
import java.util.Map;

public class InputData {

    private final int id;
    private final LocalDateTime datetime;
    private final Map<String, ComponentData> components;

    public InputData(int id, LocalDateTime datetime,
            Map<String, ComponentData> components) {
        this.id = id;
        this.datetime = datetime;
        this.components = components;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getDatetime() {
        return this.datetime;
    }

    public Map<String, ComponentData> getComponents() {
        return this.components;
    }
}