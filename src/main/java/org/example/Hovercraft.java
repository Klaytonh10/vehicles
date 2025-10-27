package org.example;

public class Hovercraft extends Vehicle {

    private static int numberOfPassengers = 0;
    private static String fuelType = "Electric";

    public Hovercraft() {

    }
    public Hovercraft(String color, String make, String model) {
        setColor(color);
        setMake(make);
        setModel(model);
    }
}
