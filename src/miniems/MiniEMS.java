package miniems;

import miniems.meter.GridMeter;
import miniems.common.channel.Channel;

public class MiniEMS {
    public static void main(String[] args) {
        
        GridMeter gridMeter = new GridMeter();
        
        Channel<Integer> activePower = (Channel<Integer>) gridMeter.channels().get(0);
        activePower.setValue(2500);

        System.out.println("Component ID: " + gridMeter.id());
        System.out.println("Channel ID: " + activePower.getChannelId());
        System.out.println("Channel belongs to GridMeter: " + (activePower.getComponent() == gridMeter));
        System.out.println("Active Power: " + activePower.getValue() + " W");
               
        System.out.println("***");
    }
}
