package StrategyPattern.WithStrategyPattern;

public class SpecialDriveStartegy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("special drive");
    }


}
