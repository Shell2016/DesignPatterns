package ru.michaelshell.patterns.structural.decorator;

public class JuniorDeveloper implements Developer {

    @Override
    public void doWork() {
        System.out.println("Writing code...");
    }
}
