package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class GasVisitor implements Visitor {
    @Override
    public void processCard(BronzeCreditCard creditCard) {
        System.out.println("Gas cashback is 1%");
    }

    @Override
    public void processCard(SilverCreditCard creditCard) {
        System.out.println("Gas cashback is 3%");
    }

    @Override
    public void processCard(GoldCreditCard creditCard) {
        System.out.println("Gas cashback is 5%");
    }
}
