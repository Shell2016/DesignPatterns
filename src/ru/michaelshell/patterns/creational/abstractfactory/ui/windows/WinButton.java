package ru.michaelshell.patterns.creational.abstractfactory.ui.windows;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}
