package ParkingLotSystem;
// https://excalidraw.com/#json=jnPxlKiIy4kaqsyKoM2mm,suzku1rolatYJxMb-DL-hg
//read only excalidraw link
public class Client {
    public static void main(String[] args) {
        Factory parkingSpotFactory=new ParkingSpotTypeFactory();

        ParkingSpotType twoWheelerType=parkingSpotFactory.createParkingSPotType("2 wheeler");
        System.out.println(twoWheelerType.getName());
    }
}
