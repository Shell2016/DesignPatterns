package ru.michaelshell.patterns.structural.adapter;

import org.w3c.dom.Node;

public class AdapterRunner {
    public static void main(String[] args) {
        Goose goose = new WhiteGoose();
        Duck duck = new BlackDuck();

        GooseToDuckAdapter adapter = new GooseToDuckAdapter(goose);
        adapter.qwa();
    }

}
