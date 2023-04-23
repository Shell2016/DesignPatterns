package ru.michaelshell.patterns.structural.adapter;

public class GooseToDuckAdapter implements Duck {
    private Goose goose;

    public GooseToDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void qwa() {
        goose.goo();
    }
}
