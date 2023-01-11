package ru.michaelshell.patterns.behavioral.observer;

public interface Observable {

    void notifyAllObservers();

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    double getTemp();

    double getHumidity();
}
