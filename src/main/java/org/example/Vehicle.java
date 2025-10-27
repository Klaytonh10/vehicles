package org.example;

public class Vehicle {
    private String color;
    private String fuelType;
    private String make;
    private String model;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int speed;

    public Vehicle() {

    }

    public Vehicle(String color, String make, String model) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    @Override
    public String toString() {
        return this.color + " " + this.make + " " + this.model;
    }
}
