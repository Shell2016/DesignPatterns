package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class FoodCashbackVisitor implements CashbackVisitor {
    @Override
    public void getCashbackForBronze(CreditCard creditCard) {
        System.out.println("Food cashback is 0%");
    }

    @Override
    public void getCashbackForSilver(CreditCard creditCard) {
        System.out.println("Food cashback is 1%");
    }

    @Override
    public void getCashbackForGold(CreditCard creditCard) {
        System.out.println("Food cashback is 2%");
    }
}
