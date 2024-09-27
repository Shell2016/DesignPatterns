package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class FoodVisitor implements Visitor {
    @Override
    public void processCard(BronzeCreditCard creditCard) {
        System.out.println("Food cashback is 0%");
    }

    @Override
    public void processCard(SilverCreditCard creditCard) {
        System.out.println("Food cashback is 1%");
    }

    @Override
    public void processCard(GoldCreditCard creditCard) {
        System.out.println("Food cashback is 2%");
    }
}
