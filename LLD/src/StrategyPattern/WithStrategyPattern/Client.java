package StrategyPattern.WithStrategyPattern;

public class Client {
    public static void main(String[] args) {
        Vehicle nv = new NormalVehicle();
        Vehicle sv = new SportsVehicle();
        Vehicle ov = new OffRoadVehicle();
        nv.drive();
        sv.drive();
        ov.drive();

        // Explanation
// 1. Strategy Interface:
//    - The DriveStrategy interface defines a method drive() that each concrete strategy must implement.
//
// 2. Concrete Strategies:
//    - NormalDriveStrategy and SpecialDriveStrategy implement the DriveStrategy interface with different behaviors.
//
// 3. Context Class:
//    - The Vehicle class now has a reference to a DriveStrategy object.
//    - The drive method delegates the behavior to the strategy object.
//
// 4. Concrete Vehicles:
//    - NormalVehicle, OffRoadVehicle, and SportsVehicle classes each pass the appropriate DriveStrategy to the Vehicle constructor.
//
// Benefits
// 1. Reduces Code Redundancy:
//    - Common behavior is encapsulated in strategy classes.
//
// 2. Encapsulates Behavior:
//    - Different behaviors are encapsulated in different strategy classes, adhering to the single responsibility principle.
//:
//    - Adding a new driving behavior requires only creating a new strategy class without modifying existing vehicle classes.
//
//// 3. Extensibility
// 4. Maintainability:
//    - This approach using the Strategy Pattern makes the code more maintainable, flexible, and extensible.

    }

}
