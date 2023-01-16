package ru.michaelshell.patterns.creational.abstractfactory.ui.mac;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Button;
import ru.michaelshell.patterns.creational.abstractfactory.ui.Checkbox;
import ru.michaelshell.patterns.creational.abstractfactory.ui.GUIFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
