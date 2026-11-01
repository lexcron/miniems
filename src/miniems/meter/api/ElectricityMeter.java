package miniems.meter.api;

import miniems.common.component.Component;
import miniems.common.channel.ElectricityMeterChannelId;

public interface ElectricityMeter extends Component {

    MeterType getMeterType();
    
    ElectricityMeterChannelId[] channelIds();

}
