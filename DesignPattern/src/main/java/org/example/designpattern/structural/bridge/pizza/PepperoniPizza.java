package org.example.designpattern.structural.bridge.pizza;

public class PepperoniPizza extends  Pizza{
    @Override
    public void assemble() {
        System.out.println("Adding Sauce:"+sauce);
        System.out.println("Adding Sauce:"+toppings);
        System.out.println("Adding Pepperoni:");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is "+crust);
    }
}

