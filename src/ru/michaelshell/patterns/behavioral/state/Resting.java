package ru.michaelshell.patterns.behavioral.state;

public class Resting implements State{
    private Person person;

    public Resting(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("Resting...");
        person.setState(new Sleeping(person));
    }
}
