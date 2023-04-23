package ru.michaelshell.patterns.structural.facade;

public class Audiosystem {

    public void on() {
        System.out.println("Audio on..");
    }

    public void volume(int vol) {
        System.out.println("Volume is set to " + vol);
    }

    public void off() {
        System.out.println("Audio off...");
    }
}
