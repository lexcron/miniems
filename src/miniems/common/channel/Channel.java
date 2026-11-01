package miniems.common.channel;

import miniems.common.component.Component;

public interface Channel {
    
    Component getComponent();
    
    ChannelId getChannelId();
    
}
