package ru.michaelshell.patterns.behavioral.strategy;

public abstract class Person {
    Activity activity;

    void execute() {
        activity.doSomething();
    };

    abstract void info();

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
