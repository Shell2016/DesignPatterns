package ru.michaelshell.patterns.creational.abstractfactory.ui.mac;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("macCheckbox");
    }
}
