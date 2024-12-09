package Mastery;

public class Minivan extends Vehicle {
    // Constructor for Minivan class
    public Minivan(double fuelEconomyCity, double fuelEconomyHwy, int seatingCapacity, double cargoVolume) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
    }

    // Override displayDetails method for Minivan
    @Override
    public String displayDetails() {
        return "Minivan:\n" + super.displayDetails();
    }
}
