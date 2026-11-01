package miniems.sum;

import java.util.List;
import java.util.ArrayList;

import miniems.channel.Channel;
import miniems.channel.ChannelId;
import miniems.channel.ChannelImpl;
import miniems.meter.GridMeter;
import miniems.meter.PVMeter;
import miniems.ess.Ess;
        
import miniems.sum.api.Sum;

public class SumImpl implements Sum {
    
    private final List<Channel<?>> channelsList;
    private final GridMeter gridMeter;
    private final PVMeter pvMeter;
    private final Ess ess;
    
    @Override
    public String id() {
        return "_sum";
    }
    
    @Override
    public List<Channel<?>> channels() {
        return this.channelsList;
    }
    
    public SumImpl(GridMeter gridMeter, PVMeter pvMeter, Ess ess) {
        this.channelsList = new ArrayList<>();
        
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.GRID_ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.PRODUCTION_ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.ESS_ACTIVE_POWER));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.ESS_SOC));
        this.channelsList.add(new ChannelImpl<Integer>(this, ChannelId.CONSUMPTION_ACTIVE_POWER));
        
        this.gridMeter = gridMeter;
        this.pvMeter = pvMeter;
        this.ess = ess;
        
    }
    
}
