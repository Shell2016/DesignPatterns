package ru.michaelshell.patterns.structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println("Doing code review...");
    }
}
