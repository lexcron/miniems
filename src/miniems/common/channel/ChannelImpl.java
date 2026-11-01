package miniems.common.channel;

import miniems.common.component.Component;

public class ChannelImpl implements Channel {
    
    private final Component component;
    private final ChannelId channelId;

    @Override
    public Component getComponent() {
        return this.component;
    }

    @Override
    public ChannelId getChannelId() {
        return this.channelId;
    }
    
    public ChannelImpl(Component component, ChannelId channelId) {
        this.component = component;
        this.channelId = channelId;
    }
}
