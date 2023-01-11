package ru.michaelshell.patterns.creational.singleton;

public enum SingletonEnum {
    UNIQUE_INSTANCE;

    public void doSomething() {
        System.out.println("Hello!");
    }
}
