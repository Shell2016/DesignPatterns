package ru.michaelshell.patterns.behavioral.strategy;

public class Eating implements Activity{
    @Override
    public void doSomething() {
        System.out.println("I'm eating...");
    }
}
