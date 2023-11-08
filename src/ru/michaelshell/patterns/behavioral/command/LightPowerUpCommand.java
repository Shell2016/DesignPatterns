package ru.michaelshell.patterns.behavioral.command;

public class LightPowerUpCommand implements Command {
    private final Light light;

    public LightPowerUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.powerUp();
    }

    @Override
    public void undo() {
        light.powerDown();
    }
}
