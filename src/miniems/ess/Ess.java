package miniems.ess;

import java.util.List;
import java.util.ArrayList;

import miniems.ess.api.SymmetricEss;
import miniems.channel.Channel;
import miniems.channel.ChannelId;
import miniems.channel.ChannelImpl;

public class Ess implements SymmetricEss {
    
    private final List<Channel<?>> channelsList; 
 
    @Override
    public String id() {
        return "ess0";
    }
    
    @Override
    public List<Channel<?>> channels() {
        return this.channelsList;
    }

    public Ess() {
        this.channelsList = new ArrayList<>();        
        
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.SOC));
    }
  
}
