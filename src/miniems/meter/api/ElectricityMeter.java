package miniems.meter.api;

import miniems.common.component.Component;

public interface ElectricityMeter extends Component {

    MeterType getMeterType();

}
