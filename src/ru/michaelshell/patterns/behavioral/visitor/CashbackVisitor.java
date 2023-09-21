package ru.michaelshell.patterns.behavioral.visitor;

public interface CashbackVisitor {
    void getCashbackForBronze(CreditCard creditCard);
    void getCashbackForSilver(CreditCard creditCard);
    void getCashbackForGold(CreditCard creditCard);
}
