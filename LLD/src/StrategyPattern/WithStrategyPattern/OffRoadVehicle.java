package StrategyPattern.WithStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDriveStartegy());
    }
}
