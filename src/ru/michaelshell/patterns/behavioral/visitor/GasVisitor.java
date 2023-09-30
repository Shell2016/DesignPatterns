package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class GasVisitor implements Visitor {
    @Override
    public void processBronzeCard(CreditCard creditCard) {
        System.out.println("Gas cashback is 1%");
    }

    @Override
    public void processSilverCard(CreditCard creditCard) {
        System.out.println("Gas cashback is 3%");
    }

    @Override
    public void processGoldCard(CreditCard creditCard) {
        System.out.println("Gas cashback is 5%");
    }
}
