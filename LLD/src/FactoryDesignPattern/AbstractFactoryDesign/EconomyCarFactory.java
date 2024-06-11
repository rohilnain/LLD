package FactoryDesignPattern.AbstractFactoryDesign;

public class EconomyCarFactory implements Factory{
    @Override
    public LuxuryCar createLuxuryCar(String carType) {
        return null;
    }

    @Override
    public EconomyCar createEconomyCar(String carType) {
        return switch (carType.toLowerCase()) {
            case "swift" -> new Swift();
            case "hyundai" -> new Hyundai();
            default -> throw new IllegalArgumentException("Unsupported carType: " + carType);
        };
    }
}
