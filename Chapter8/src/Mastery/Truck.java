package Mastery;

public class Truck extends Vehicle {
    // Constructor for Truck class
    public Truck(double fuelEconomyCity, double fuelEconomyHwy, int seatingCapacity, double cargoVolume) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
    }

    // Override displayDetails method for Truck
    @Override
    public String displayDetails() {
        return "Truck:\n" + super.displayDetails();
    }
}

