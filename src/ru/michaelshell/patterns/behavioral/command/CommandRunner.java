package ru.michaelshell.patterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        Light light = new Light();
        LightControl lightControl = new LightControl(new LightOnCommand(light),
                new LightOffCommand(light),
                new LightPowerUpCommand(light),
                new LightPowerDownCommand(light));

        lightControl.lightOnButton();
        lightControl.lightPowerUpButton();
        lightControl.lightPowerUpButton();
        lightControl.lightPowerDownButton();
        lightControl.lightOffButton();
        lightControl.undo();
        lightControl.undo();
        lightControl.undo();
        lightControl.undo();
        lightControl.undo();
        lightControl.undo();
        lightControl.undo();
    }
}
