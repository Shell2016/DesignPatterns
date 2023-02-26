package ru.michaelshell.patterns.creational.prototype;

public class Car extends Vehicle{
    private int topSpeed;

    public Car() {
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
