package ru.michaelshell.patterns.behavioral.chainofresponsibility;

public abstract class Filter {

    private Filter next;

    public Filter setNextFilter(Filter next) {
        this.next = next;
        return next;
    }

    abstract void doFilter(String username, String password);

    protected void doFilterNext(String username, String password) {
        if (next != null) {
            next.doFilter(username, password);
        }
    }
}
