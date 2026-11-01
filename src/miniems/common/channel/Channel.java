package miniems.common.channel;

import miniems.common.component.Component;

public interface Channel<T> {
    
    Component getComponent();
    
    ChannelId getChannelId();
    
}
