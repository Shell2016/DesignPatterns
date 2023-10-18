package ru.michaelshell.patterns.behavioral.templatemethod;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    void createObjects() {
        System.out.println("Creating WoW objects...");
    }

    @Override
    void loadObjects() {
        System.out.println("Loading WoW objects...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing WoW profiles...");
    }
}
