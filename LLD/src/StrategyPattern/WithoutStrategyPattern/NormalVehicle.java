package StrategyPattern.WithoutStrategyPattern;

public class NormalVehicle extends Vehicle{
    @Override
    void drive(){
        System.out.println("Inside Normal Drive");
    }
}
