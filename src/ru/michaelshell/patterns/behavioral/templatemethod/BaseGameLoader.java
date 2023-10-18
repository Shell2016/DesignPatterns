package ru.michaelshell.patterns.behavioral.templatemethod;

public abstract class BaseGameLoader {
    public void load() {
        createObjects();
        loadObjects();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract void createObjects();
    abstract void loadObjects();
    abstract void initializeProfiles();

    void cleanTempFiles() {
        System.out.println("Cleaning temp files...");
    }
}
