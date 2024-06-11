package FactoryDesignPattern.AbstractFactoryDesign;

public class Client {
    public static void main(String[] args) {
        Factory luxuryCarFactory=new LuxuryCarFactory();
        Factory economyCarFactory=new EconomyCarFactory();

        LuxuryCar mercedes= luxuryCarFactory.createLuxuryCar("mercedes");
        EconomyCar swift= economyCarFactory.createEconomyCar("swift");

        mercedes.drive();
        swift.drive();
    }
}
