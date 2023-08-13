package datastructure.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue");
        Bus bus = new Bus("Mercedes", "Setra", "White");

        cache.put("Bugatti", car);
        cache.put("Mercedes", bus);
    }

    public Vehicle get(String key) {
        return cache.get(key).clone();
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() , vehicle));
    }
}
