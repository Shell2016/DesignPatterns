package ru.michaelshell.patterns.behavioral.visitor;

public interface Visitor {
    void processCard(BronzeCreditCard creditCard);
    void processCard(SilverCreditCard creditCard);
    void processCard(GoldCreditCard creditCard);
}
