package ru.michaelshell.patterns.behavioral.observer;

public class HumidityDisplay implements Observer, DisplayElement{

    private double humidity;
    private final Observable observable;

    public HumidityDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humidity: " + humidity + "%");
    }

    @Override
    public void update() {
        humidity = observable.getHumidity();
        display();
    }
}
