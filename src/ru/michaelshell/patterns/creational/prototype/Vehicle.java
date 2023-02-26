package ru.michaelshell.patterns.creational.prototype;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract Vehicle clone();
}
