package ru.michaelshell.patterns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Developer teamLead = new TeamLead(new SeniorDeveloper(new JuniorDeveloper()));
        teamLead.doWork();
    }
}
