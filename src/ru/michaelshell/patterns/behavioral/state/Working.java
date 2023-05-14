package ru.michaelshell.patterns.behavioral.state;

public class Working implements State{
    private Person person;

    public Working(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("Working...");
        person.setState(new Resting(person));
    }
}
