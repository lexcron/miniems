package miniems.common.channel;

import miniems.common.component.Component;

public class ChannelImpl<T> implements Channel<T> {
    
    private final Component component;
    private final ChannelId channelId;
    private T value;

    @Override
    public Component getComponent() {
        return this.component;
    }

    @Override
    public ChannelId getChannelId() {
        return this.channelId;
    }
    
    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
    
    public ChannelImpl(Component component, ChannelId channelId) {
        this.component = component;
        this.channelId = channelId;
    }
}
