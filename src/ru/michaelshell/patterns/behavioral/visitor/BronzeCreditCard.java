package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class BronzeCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Bronze card";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.processBronzeCard(this);
    }
}
