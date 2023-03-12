package ru.michaelshell.patterns.structural.decorator;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println("Teamleading...");
    }
}
