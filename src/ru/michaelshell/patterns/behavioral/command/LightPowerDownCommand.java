package ru.michaelshell.patterns.behavioral.command;

public class LightPowerDownCommand implements Command {
    private final Light light;

    public LightPowerDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.powerDown();
    }

    @Override
    public void undo() {
        light.powerUp();
    }
}
