package ru.michaelshell.patterns.behavioral.strategy;

public class Working implements Activity{
    @Override
    public void doSomething() {
        System.out.println("I'm working...");
    }
}
