package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class GoldCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Gold card";
    }

    @Override
    public void accept(CashbackVisitor cashbackVisitor) {
        cashbackVisitor.getCashbackForGold(this);
    }
}
