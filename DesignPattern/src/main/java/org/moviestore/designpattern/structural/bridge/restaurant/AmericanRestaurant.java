package org.example.designpattern.structural.bridge.restaurant;

import org.example.designpattern.structural.bridge.pizza.Pizza;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    void addToppings() {
        pizza.setToppings("Everything");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
