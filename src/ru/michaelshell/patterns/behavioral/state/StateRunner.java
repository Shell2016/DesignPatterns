package ru.michaelshell.patterns.behavioral.state;

public class StateRunner {
    public static void main(String[] args) {
        Person person = new Person();

        person.doWork();
        person.doWork();
        person.doWork();
        person.doWork();
        person.doWork();
    }
}
