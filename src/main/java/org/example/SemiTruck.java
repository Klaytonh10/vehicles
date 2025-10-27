package org.example;

public class SemiTruck extends WheeledVehicle{

    private static int numberOfPassengers = 1;
    private static int numberOfWheels = 18;
    private static String fuelType = "Diesel";

    public SemiTruck() {

    }

    public SemiTruck(String color, String make, String model) {
        setColor(color);
        setMake(make);
        setModel(model);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

}
