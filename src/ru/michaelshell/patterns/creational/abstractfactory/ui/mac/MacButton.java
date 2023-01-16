package ru.michaelshell.patterns.creational.abstractfactory.ui.mac;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}
