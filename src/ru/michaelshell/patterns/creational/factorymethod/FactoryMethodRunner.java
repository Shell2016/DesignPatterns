package ru.michaelshell.patterns.creational.factorymethod;

public class FactoryMethodRunner {
    public static void main(String[] args) {
//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}
