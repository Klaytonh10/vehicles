package org.example;

public class Moped extends WheeledVehicle {

    private static String fuelType = "Gasoline";
    private static int numberOfWheels = 1;

    public Moped() {

    }

    public Moped(String color, String make, String model) {
        setMake(make);
        setModel(model);

        setColor(color);
        setNumberOfPassengers(2);
    }



    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
