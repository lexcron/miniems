package miniems.meter;

import java.util.ArrayList;
import java.util.List;

import miniems.meter.api.ElectricityMeter;
import miniems.meter.api.MeterType;

import miniems.common.channel.Channel;
import miniems.common.channel.ChannelImpl;
import miniems.common.channel.ChannelId;

public class GridMeter implements ElectricityMeter {
    
    private final List<Channel<?>> channelsList;
    
    @Override
    public String id() {
        return "gridMeter0";
    }
    
    @Override
    public MeterType getMeterType() {
        return MeterType.GRID;
    }
    
    @Override
    public List<Channel<?>> channels() {
        return this.channelsList;
    }
    
    public GridMeter() {
        this.channelsList = new ArrayList<>();
        
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.VOLTAGE));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.CURRENT));
        
    }
    
}
