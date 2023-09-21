package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class GasCashbackVisitor implements CashbackVisitor {
    @Override
    public void getCashbackForBronze(CreditCard creditCard) {
        System.out.println("Gas cashback is 1%");
    }

    @Override
    public void getCashbackForSilver(CreditCard creditCard) {
        System.out.println("Gas cashback is 3%");
    }

    @Override
    public void getCashbackForGold(CreditCard creditCard) {
        System.out.println("Gas cashback is 5%");
    }
}
