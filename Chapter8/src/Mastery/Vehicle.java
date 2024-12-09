package Mastery;

public class Vehicle {
    // Instance variables
    private double fuelEconomyCity;  // fuel economy in city (mpg)
    private double fuelEconomyHwy;   // fuel economy on highway (mpg)
    private int seatingCapacity;     // number of seats
    private double cargoVolume;      // cargo volume in cubic feet

    // Constructor
    public Vehicle(double fuelEconomyCity, double fuelEconomyHwy, int seatingCapacity, double cargoVolume) {
        this.fuelEconomyCity = fuelEconomyCity;
        this.fuelEconomyHwy = fuelEconomyHwy;
        this.seatingCapacity = seatingCapacity;
        this.cargoVolume = cargoVolume;
    }

    // Getters and Setters
    public double getFuelEconomyCity() {
        return fuelEconomyCity;
    }

    public void setFuelEconomyCity(double fuelEconomyCity) {
        this.fuelEconomyCity = fuelEconomyCity;
    }

    public double getFuelEconomyHwy() {
        return fuelEconomyHwy;
    }

    public void setFuelEconomyHwy(double fuelEconomyHwy) {
        this.fuelEconomyHwy = fuelEconomyHwy;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    // Method to display vehicle details
    public String displayDetails() {
        return String.format("Fuel Economy (City): %.2f mpg\nFuel Economy (Highway): %.2f mpg\nSeating Capacity: %d people\nCargo Volume: %.2f cubic feet",
                fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
    }
}

