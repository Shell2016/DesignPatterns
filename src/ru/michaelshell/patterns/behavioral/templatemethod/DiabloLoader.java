package ru.michaelshell.patterns.behavioral.templatemethod;

public class DiabloLoader extends BaseGameLoader {
    @Override
    void createObjects() {
        System.out.println("Creating diablo objects...");
    }

    @Override
    void loadObjects() {
        System.out.println("Loading diablo objects...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing diablo profiles...");
    }
}
