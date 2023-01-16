package ru.michaelshell.patterns.creational.abstractfactory;

import ru.michaelshell.patterns.creational.abstractfactory.ui.GUIFactory;
import ru.michaelshell.patterns.creational.abstractfactory.ui.mac.MacGUIFactory;
import ru.michaelshell.patterns.creational.abstractfactory.ui.windows.WinGUIFactory;

public class ApplicationRunner {
    public static void main(String[] args) {

//        GUIFactory factory = new MacGUIFactory();
        GUIFactory factory = new WinGUIFactory();

        Application app = new Application(factory);
        app.paint();
    }
}
