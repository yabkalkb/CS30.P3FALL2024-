package Mastery;

public class Car extends Vehicle {
    // Constructor for Car class
    public Car(double fuelEconomyCity, double fuelEconomyHwy, int seatingCapacity, double cargoVolume) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
    }

    // Override displayDetails method for Car
    @Override
    public String displayDetails() {
        return "Car:\n" + super.displayDetails();
    }
}
