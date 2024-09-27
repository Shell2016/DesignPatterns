package ru.michaelshell.patterns.behavioral.visitor;

public class PriorityPassVisitor implements Visitor {
    @Override
    public void processCard(BronzeCreditCard creditCard) {
        System.out.println("Priority pass not allowed. Please upgrade your card to Gold");
    }

    @Override
    public void processCard(SilverCreditCard creditCard) {
        System.out.println("Priority pass not allowed. Please upgrade your card to Gold");
    }

    @Override
    public void processCard(GoldCreditCard creditCard) {
        System.out.println("Priority pass allowed");
    }
}
