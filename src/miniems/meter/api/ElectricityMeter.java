package miniems.meter.api;

import miniems.component.Component;

public interface ElectricityMeter extends Component {

    MeterType getMeterType();

}
