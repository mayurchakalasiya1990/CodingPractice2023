package org.example.designpattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public abstract class Vehicle {

    private String color;
    private String model;
    private String brand;

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }
    public abstract Vehicle clone();

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
