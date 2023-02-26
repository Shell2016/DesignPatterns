package ru.michaelshell.patterns.creational.prototype;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus() {}

    public Bus(Bus bus) {
        super(bus);
        this.passengerCapacity = bus.passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
