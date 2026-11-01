package miniems.meter;

import java.util.List;
import java.util.ArrayList;

import miniems.channel.Channel;
import miniems.channel.ChannelId;
import miniems.channel.ChannelImpl;

import miniems.meter.api.ElectricityMeter;
import miniems.meter.api.MeterType;


public class ConsumptionMeter implements ElectricityMeter {
    
    private final List<Channel<?>> channelsList;
    
    @Override
    public String id() {
        return "consumptionMeter0";
    } 
    
    @Override
    public MeterType getMeterType() {
        return MeterType.CONSUMPTION;
    }
    
    @Override
    public List<Channel<?>> channels() {
        return this.channelsList;
    }
    
    public ConsumptionMeter() {
        this.channelsList = new ArrayList<>();
        this.channelsList.add(new ChannelImpl(this, ChannelId.ACTIVE_POWER));
    }
    
}
