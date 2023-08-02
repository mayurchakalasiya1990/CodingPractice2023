package org.example.designpattern.behavioral.observer;

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The Orcs are facing %s weather now".formatted(weatherType.getDescription()));
    }
}
