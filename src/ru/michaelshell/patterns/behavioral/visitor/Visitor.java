package ru.michaelshell.patterns.behavioral.visitor;

public interface Visitor {
    void processBronzeCard(CreditCard creditCard);
    void processSilverCard(CreditCard creditCard);
    void processGoldCard(CreditCard creditCard);
}
