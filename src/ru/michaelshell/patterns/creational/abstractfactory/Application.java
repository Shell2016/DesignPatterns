package ru.michaelshell.patterns.creational.abstractfactory;

import ru.michaelshell.patterns.creational.abstractfactory.ui.Button;
import ru.michaelshell.patterns.creational.abstractfactory.ui.Checkbox;
import ru.michaelshell.patterns.creational.abstractfactory.ui.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
