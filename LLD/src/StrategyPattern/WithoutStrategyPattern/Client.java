package StrategyPattern.WithoutStrategyPattern;

public class Client {
    public static void main(String[] args) {
        NormalVehicle nv=new NormalVehicle();
        SportsVehicle sv=new SportsVehicle();
        OffRoadVehicle ov=new OffRoadVehicle();


        //now problem here this OffRoadVehicle and SportsVehicle both have same method and both are overriding
        //it to same method (same functionality) so code redundancy
        nv.drive();
        sv.drive();
        ov.drive();
    }
}
