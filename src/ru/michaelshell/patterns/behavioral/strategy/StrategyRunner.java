package ru.michaelshell.patterns.behavioral.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Person dev = new Developer();
        dev.setActivity(new Working());
        dev.execute();
        dev.info();
        dev.setActivity(new Eating());
        dev.execute();
        dev.info();
    }
}
