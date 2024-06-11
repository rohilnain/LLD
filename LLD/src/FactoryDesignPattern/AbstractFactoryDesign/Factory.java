package FactoryDesignPattern.AbstractFactoryDesign;

public interface Factory {
    LuxuryCar createLuxuryCar(String carType);
    EconomyCar createEconomyCar(String carType);
}
