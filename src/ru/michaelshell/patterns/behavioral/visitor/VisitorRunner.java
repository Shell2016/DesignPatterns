package ru.michaelshell.patterns.behavioral.visitor;

import java.util.*;

/**
 * @author Mikhail Sheludyakov
 */
public class VisitorRunner {
    public static void main(String[] args) {

        List<CreditCard> creditCards = new ArrayList<>();
        creditCards.add(new BronzeCreditCard());
        creditCards.add(new SilverCreditCard());
        creditCards.add(new GoldCreditCard());

        creditCards.forEach(creditCard -> creditCard.accept(new FoodVisitor()));
        creditCards.forEach(creditCard -> creditCard.accept(new GasVisitor()));
        System.out.println("**************************");
        creditCards.forEach(creditCard -> creditCard.accept(new PriorityPassVisitor()));
    }
}
