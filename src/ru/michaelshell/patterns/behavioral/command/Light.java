package ru.michaelshell.patterns.behavioral.command;

public class Light {

    public void on() {
        System.out.println("Light is on.. ");
    }

    public void off() {
        System.out.println("Light is off..");
    }

    public void powerUp() {
        System.out.println("Light is powered up...");
    }

    public void powerDown() {
        System.out.println("Light is powered down..");
    }
}
