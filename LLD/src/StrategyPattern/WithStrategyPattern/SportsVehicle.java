package StrategyPattern.WithStrategyPattern;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SpecialDriveStartegy());
    }
}
