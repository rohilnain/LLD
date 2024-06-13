package ParkingLotSystem;

public abstract class ParkingSpotType {
    protected String name;

    ParkingSpotType(String name){
        this.name=name;
    }

     String getName(){
        return name;
    }

    //you can add more behaviour as you want
    //it is abstract as it should not be instantiated
    //for abstract clas it does not matter whether methods are abstract or not
    //it only means its objects cannot be created
}
