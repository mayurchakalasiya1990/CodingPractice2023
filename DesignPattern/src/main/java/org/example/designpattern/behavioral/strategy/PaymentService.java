package org.example.designpattern.behavioral.strategy;

import lombok.Setter;
import org.example.designpattern.behavioral.strategy.paymentstrategy.PaymentStrategy;

@Setter
public class PaymentService {
    private int cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
