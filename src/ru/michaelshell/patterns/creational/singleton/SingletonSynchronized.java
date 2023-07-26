package ru.michaelshell.patterns.creational.singleton;

public class SingletonSynchronized {
    private static volatile SingletonSynchronized singleton;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if (singleton == null) {
            synchronized (SingletonSynchronized.class) {
                if (singleton == null) {
                    singleton = new SingletonSynchronized();
                }
            }
        }
        return singleton;
    }
}
