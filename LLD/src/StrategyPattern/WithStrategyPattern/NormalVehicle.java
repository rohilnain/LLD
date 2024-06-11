package StrategyPattern.WithStrategyPattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
