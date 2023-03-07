package org.example.designpattern.behavioral.observer;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WeatherType {
    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");

    private final String description;
    public String toString() {
        return this.name().toLowerCase();
    }

}
