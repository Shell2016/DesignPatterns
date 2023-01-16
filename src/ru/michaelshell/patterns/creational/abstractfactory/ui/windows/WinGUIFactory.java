package ru.michaelshell.patterns.creational.abstractfactory.ui.windows;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Button;
import ru.michaelshell.patterns.creational.abstractfactory.ui.Checkbox;
import ru.michaelshell.patterns.creational.abstractfactory.ui.GUIFactory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
