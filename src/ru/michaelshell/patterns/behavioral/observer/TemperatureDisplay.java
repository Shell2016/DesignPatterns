package ru.michaelshell.patterns.behavioral.observer;

public class TemperatureDisplay implements Observer, DisplayElement{

    private double temp;
    private final Observable observable;

    public TemperatureDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + "C");
    }

    @Override
    public void update() {
        temp = observable.getTemp();
        display();
    }
}
