package org.example.designpattern.behavioral.observer;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class Weather {

    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;


    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to %s.".formatted(currentWeather));
        notifyObservers();
    }

    private void notifyObservers() {
        for (var obs:observers) {
            obs.update(currentWeather);
        }
    }


}
