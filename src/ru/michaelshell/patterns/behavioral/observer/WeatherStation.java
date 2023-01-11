package ru.michaelshell.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private double temp;
    private double humidity;

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setData(double temp, double humidity) {
        this.temp = temp;
        this.humidity = humidity;
        notifyAllObservers();
    }


    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }
}
