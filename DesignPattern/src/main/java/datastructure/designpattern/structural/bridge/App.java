package datastructure.designpattern.structural.bridge;

import datastructure.designpattern.structural.bridge.pizza.PepperoniPizza;
import datastructure.designpattern.structural.bridge.pizza.VeggiPizza;
import datastructure.designpattern.structural.bridge.restaurant.AmericanRestaurant;
import datastructure.designpattern.structural.bridge.restaurant.ItalianRestaurant;
import datastructure.designpattern.structural.bridge.restaurant.Restaurant;

public class App {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiPizza());
        italianRestaurant.deliver();

    }
}
