package StrategyPattern.WithStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal strategy");
    }
}
