package ru.michaelshell.patterns.behavioral.state;

public class Training implements State{
    private Person person;

    public Training(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("Training...");
        person.setState(new Working(person));
    }
}
