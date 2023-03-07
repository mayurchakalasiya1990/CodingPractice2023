package org.example.designpattern.behavioral.strategy.paymentstrategy;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();

    void pay(int amount);
}
