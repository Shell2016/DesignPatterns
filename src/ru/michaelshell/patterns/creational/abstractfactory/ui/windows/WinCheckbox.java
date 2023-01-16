package ru.michaelshell.patterns.creational.abstractfactory.ui.windows;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WinCheckbox");
    }
}
