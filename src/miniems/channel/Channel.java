package miniems.channel;

import miniems.component.Component;

public interface Channel<T> {
    
    Component getComponent();
    
    ChannelId getChannelId();
    
    T getValue();

    void setValue(T value);
    
}
