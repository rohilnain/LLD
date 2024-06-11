package FactoryDesignPattern.AbstractFactoryDesign;

public class Mercedes implements LuxuryCar{
    @Override
    public void drive() {
        System.out.println("driving Mercedes Luxury Car");
    }
}
