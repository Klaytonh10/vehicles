package org.example;

public class Car extends WheeledVehicle {

    private static int numberOfPassengers = 3;
    private static String fuelType = "Gasoline";

    public Car() {

    }

    public Car(String color, String make, String model) {
        setColor(color);
        setMake(make);
        setModel(model);

        setNumberOfPassengers(4);
    }



}
