package ru.michaelshell.patterns.behavioral.state;

public class Sleeping implements State{
    private Person person;

    public Sleeping(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("Sleeping...");
        person.setState(new Training(person));
    }
}
