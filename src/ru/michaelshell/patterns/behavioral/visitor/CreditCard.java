package ru.michaelshell.patterns.behavioral.visitor;


public interface CreditCard {
    String getName();
    void accept(CashbackVisitor cashbackVisitor);
}
