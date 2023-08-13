package datastructure.designpattern.behavioral.strategy.paymentstrategy;

import datastructure.designpattern.behavioral.strategy.PaymentService;

public class App {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);
        System.out.println("=".repeat(10));
        paymentService.setStrategy(new PaymentByPaypal());
        paymentService.processOrder(1000);
    }
}
