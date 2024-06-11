package FactoryDesignPattern.AbstractFactoryDesign;

public class Audi implements LuxuryCar{
    @Override
    public void drive() {
        System.out.println("driving Audi Luxury Car");
    }
}
