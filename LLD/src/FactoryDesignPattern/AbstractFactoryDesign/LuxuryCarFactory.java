package FactoryDesignPattern.AbstractFactoryDesign;

public class LuxuryCarFactory implements Factory{
    @Override
    public LuxuryCar createLuxuryCar(String carType) {
        switch (carType.toLowerCase()){
            case "mercedes": return new Mercedes();
            case "audi": return new Audi();
            default: throw new IllegalArgumentException("Unsupported carType: "+carType);
        }
    }

    @Override
    public EconomyCar createEconomyCar(String carType) {
        return null;
    }
}
