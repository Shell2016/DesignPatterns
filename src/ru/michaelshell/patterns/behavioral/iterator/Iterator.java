package ru.michaelshell.patterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
