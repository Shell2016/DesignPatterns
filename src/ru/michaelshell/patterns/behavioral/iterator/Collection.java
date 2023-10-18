package ru.michaelshell.patterns.behavioral.iterator;

public interface Collection<T> {
    Iterator<T> getIterator();
}
