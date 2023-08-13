package datastructure.designpattern.structural.bridge.restaurant;

import datastructure.designpattern.structural.bridge.pizza.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    void addToppings() {
        pizza.setToppings("-");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
