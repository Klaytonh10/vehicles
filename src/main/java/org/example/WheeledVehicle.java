package org.example;

public class WheeledVehicle extends Vehicle {
    int numberOfWheels;

    public WheeledVehicle() {

    }

    public WheeledVehicle(String color, String make, String model) {
        super(color, make, model);
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
}
