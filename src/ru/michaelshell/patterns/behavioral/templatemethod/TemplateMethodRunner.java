package ru.michaelshell.patterns.behavioral.templatemethod;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        DiabloLoader diabloLoader = new DiabloLoader();
        WorldOfWarcraftLoader wowLoader = new WorldOfWarcraftLoader();

        diabloLoader.load();
        System.out.println("++++++++++++++++++");
        wowLoader.load();
    }
}
