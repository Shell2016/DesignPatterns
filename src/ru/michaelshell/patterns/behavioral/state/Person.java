package ru.michaelshell.patterns.behavioral.state;

public class Person {
    State state;

    public Person() {
        this.state = new Sleeping(this);
    }

    public void doWork() {
        state.doWork();
    }

    public void setState(State state) {
        this.state = state;
    }
}
