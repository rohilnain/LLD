package FactoryDesignPattern.AbstractFactoryDesign;

public class Hyundai implements  EconomyCar{
    @Override
    public void drive() {
        System.out.println("driving Hyundai Economy Car");
    }
}
