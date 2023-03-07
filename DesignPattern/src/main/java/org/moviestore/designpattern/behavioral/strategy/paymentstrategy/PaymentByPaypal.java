package org.example.designpattern.behavioral.strategy.paymentstrategy;

public class PaymentByPaypal implements  PaymentStrategy{
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password...
        email = "PayPal Mail";
        password = "PayPal Password";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Paypal Info: %s | %s%n".formatted(email, password));
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
