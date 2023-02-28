package org.example.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = List.of(
                new Car("car_brand","300","car_model"),
                new Bus("bus_brand","300","bus_model")
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);
    }
}
