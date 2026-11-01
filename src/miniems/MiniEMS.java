package miniems;

import miniems.meter.GridMeter;
import miniems.common.channel.Channel;

public class MiniEMS {
    public static void main(String[] args) {
        
        GridMeter gridMeter = new GridMeter();
        Channel channel = gridMeter.channels().get(0);

        System.out.println("Component ID: " + gridMeter.id());
        System.out.println("Channel ID: " + channel.getChannelId());
        System.out.println("Channel belongs to GridMeter: " + (channel.getComponent() == gridMeter));
        
        Channel channel2 = gridMeter.channels().get(1);
        System.out.println("Channel ID: " + channel2.getChannelId());
        System.out.println("Channel belongs to GridMeter: " + (channel2.getComponent() == gridMeter));
                
        
        System.out.println("***");
    }
}
