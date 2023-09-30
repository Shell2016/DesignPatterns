package ru.michaelshell.patterns.behavioral.visitor;

public class PriorityPassVisitor implements Visitor {
    @Override
    public void processBronzeCard(CreditCard creditCard) {
        System.out.println("Priority pass not allowed. Please upgrade your card to Gold");
    }

    @Override
    public void processSilverCard(CreditCard creditCard) {
        System.out.println("Priority pass not allowed. Please upgrade your card to Gold");
    }

    @Override
    public void processGoldCard(CreditCard creditCard) {
        System.out.println("Priority pass allowed");
    }
}
