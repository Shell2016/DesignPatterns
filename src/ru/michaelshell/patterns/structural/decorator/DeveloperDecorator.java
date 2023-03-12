package ru.michaelshell.patterns.structural.decorator;

public class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void doWork() {
        developer.doWork();
    }
}
