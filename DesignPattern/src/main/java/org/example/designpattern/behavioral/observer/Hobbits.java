package org.example.designpattern.behavioral.observer;

public class Hobbits implements  WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The hobbits are facing %s weather now".formatted(weatherType.getDescription()));
    }
}
