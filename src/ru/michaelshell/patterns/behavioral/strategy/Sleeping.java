package ru.michaelshell.patterns.behavioral.strategy;

public class Sleeping implements Activity{
    @Override
    public void doSomething() {
        System.out.println("I'm sleeping...");
    }
}
