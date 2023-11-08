package ru.michaelshell.patterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class LightControl {
    private final Command lightOnCommand;
    private final Command lightOffCommand;
    private final Command lightPowerUpCommand;
    private final Command lightPowerDownCommand;

    private final Deque<Command> stack = new ArrayDeque<>();

    public LightControl(Command lightOnCommand,
                        Command lightOffCommand,
                        Command lightPowerUpCommand,
                        Command lightPowerDownCommand) {
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
        this.lightPowerUpCommand = lightPowerUpCommand;
        this.lightPowerDownCommand = lightPowerDownCommand;
    }

    public void lightOnButton() {
        lightOnCommand.execute();
        stack.push(lightOnCommand);
    }

    public void lightOffButton() {
        lightOffCommand.execute();
        stack.push(lightOffCommand);
    }

    public void lightPowerUpButton() {
        lightPowerUpCommand.execute();
        stack.push(lightPowerUpCommand);
    }

    public void lightPowerDownButton() {
        lightPowerDownCommand.execute();
        stack.push(lightPowerDownCommand);
    }

    public void undo() {
        if (!stack.isEmpty()) {
            System.out.print("Undoing last command... ");
            stack.pop().undo();
        }
    }
}
