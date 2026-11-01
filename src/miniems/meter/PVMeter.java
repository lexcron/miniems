package miniems.meter;

import java.util.ArrayList;
import java.util.List;

import miniems.meter.api.ElectricityMeter;
import miniems.meter.api.MeterType;
import miniems.channel.Channel;
import miniems.channel.ChannelId;
import miniems.channel.ChannelImpl;

public class PVMeter implements ElectricityMeter {
    
    private final List<Channel<?>> channelsList;
    
    
    @Override
    public String id() {
        return "pvMeter0";
    }
    
    @Override
    public MeterType getMeterType() {
        return MeterType.PRODUCTION;
    }
    
    @Override
    public List<Channel<?>> channels() {
        return this.channelsList;
    }
    
    public PVMeter() {
        this.channelsList = new ArrayList<>();
        
        this.channelsList.add(new ChannelImpl(this, ChannelId.ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl(this, ChannelId.CURRENT));
        this.channelsList.add(new ChannelImpl(this, ChannelId.VOLTAGE));
    
    }
    
}
