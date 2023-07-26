package ru.michaelshell.patterns.behavioral.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        return next == null ? true : next.handle(username, password);
    }
}
