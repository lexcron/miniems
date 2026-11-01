package miniems;

import miniems.channel.Channel;
import miniems.meter.ConsumptionMeter;
import miniems.meter.GridMeter;
import miniems.meter.PVMeter;
import miniems.ess.Ess;

public class MiniEMS {
    public static void main(String[] args) {
        
        GridMeter gridMeter = new GridMeter();
        
        Channel<Integer> activePower = (Channel<Integer>) gridMeter.channels().get(0);
        activePower.setValue(2500);

        System.out.println("Component ID: " + gridMeter.id());
        System.out.println("Channel ID: " + activePower.getChannelId());
        System.out.println("Active Power: " + activePower.getValue() + " W");
        
        PVMeter pvMeter = new PVMeter();
        Channel<Integer> activePowerPvMeter = (Channel<Integer>) pvMeter.channels().get(0);
        activePowerPvMeter.setValue(1000);
        
        System.out.println("Component ID: " + pvMeter.id());
        System.out.println("Channel ID: " + activePowerPvMeter.getChannelId());
        System.out.println("Active Power: " + activePowerPvMeter.getValue() + " W");
        
        Ess ess = new Ess();
        Channel<Integer> activePowerEss = (Channel<Integer>) ess.channels().get(0);
        activePowerEss.setValue(5000);
        
        System.out.println("Component ID: " + ess.id());
        System.out.println("Channel ID: " + activePowerEss.getChannelId());
        System.out.println("Active Power: " + activePowerEss.getValue() + " W");
        
        ConsumptionMeter consumptionMeter = new ConsumptionMeter();
        Channel<Integer> activePowerConsumptionMeter = (Channel<Integer>) consumptionMeter.channels().get(0);
        activePowerConsumptionMeter.setValue(7000);
        
        System.out.println("Component ID: " + consumptionMeter.id());
        System.out.println("Channel ID: " + activePowerConsumptionMeter.getChannelId());
        System.out.println("Active Power: " + activePowerConsumptionMeter.getValue() + " W");
        
                         
        
    }
}
