package org.example.designpattern.structural.bridge;

import org.example.designpattern.structural.bridge.pizza.PepperoniPizza;
import org.example.designpattern.structural.bridge.pizza.VeggiPizza;
import org.example.designpattern.structural.bridge.restaurant.AmericanRestaurant;
import org.example.designpattern.structural.bridge.restaurant.ItalianRestaurant;
import org.example.designpattern.structural.bridge.restaurant.Restaurant;

public class App {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiPizza());
        italianRestaurant.deliver();

    }
}
