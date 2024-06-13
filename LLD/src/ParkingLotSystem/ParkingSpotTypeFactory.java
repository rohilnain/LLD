package ParkingLotSystem;

public class ParkingSpotTypeFactory implements Factory{
    @Override
    public ParkingSpotType createParkingSPotType(String parkingSpotTypeName) {
        return switch (parkingSpotTypeName.toLowerCase()){
            case "handicapped"->new HandicappedParkingSpot();
            case "2 wheeler"-> new TwoWheelerParkingSpot();
            case "4 wheeler light"-> new FourWheelerLightParkingSpot();
            case "4 wheeler heavy"-> new FourWheelerHeavyParkingSpot();
            default-> throw new IllegalArgumentException("Unsupprted Parking Spot Type: "+parkingSpotTypeName);
        };
    }
}
