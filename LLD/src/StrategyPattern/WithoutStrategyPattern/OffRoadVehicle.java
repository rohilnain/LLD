package StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    void drive(){
        System.out.println("Inside Special Drive");
    }
}
