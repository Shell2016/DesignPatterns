package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class FoodVisitor implements Visitor {
    @Override
    public void processBronzeCard(CreditCard creditCard) {
        System.out.println("Food cashback is 0%");
    }

    @Override
    public void processSilverCard(CreditCard creditCard) {
        System.out.println("Food cashback is 1%");
    }

    @Override
    public void processGoldCard(CreditCard creditCard) {
        System.out.println("Food cashback is 2%");
    }
}
