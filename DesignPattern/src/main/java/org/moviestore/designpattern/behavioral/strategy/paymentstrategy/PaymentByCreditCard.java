package org.example.designpattern.behavioral.strategy.paymentstrategy;

import org.example.designpattern.behavioral.strategy.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy{

    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Collecting Credit card details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: " + card);
        return true;

    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
