package ru.michaelshell.patterns.behavioral.visitor;

/**
 * @author Mikhail Sheludyakov
 */
public class SilverCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Silver card";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.processCard(this);
    }
}
