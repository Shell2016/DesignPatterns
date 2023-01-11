package ru.michaelshell.patterns.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.UNIQUE_INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.UNIQUE_INSTANCE;
        System.out.println(singletonEnum1.hashCode());
        System.out.println(singletonEnum2.hashCode());
        singletonEnum2.doSomething();
        System.out.println();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println();

        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized2 = SingletonSynchronized.getInstance();
        System.out.println(singletonSynchronized1.hashCode());
        System.out.println(singletonSynchronized2.hashCode());


    }
}
