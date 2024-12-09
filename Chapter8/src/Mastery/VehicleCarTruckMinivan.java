package Mastery;

public class VehicleCarTruckMinivan {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Vehicle car = new Car(25, 30, 5, 15);         // Car with given attributes
        Vehicle truck = new Truck(15, 20, 3, 50);    // Truck with given attributes
        Vehicle minivan = new Minivan(22, 28, 7, 40); // Minivan with given attributes

        // Print details of each vehicle
        System.out.println(car.displayDetails());
        System.out.println();
        System.out.println(truck.displayDetails());
        System.out.println();
        System.out.println(minivan.displayDetails());
    }
}
