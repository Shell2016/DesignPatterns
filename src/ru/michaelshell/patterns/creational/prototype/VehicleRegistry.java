package ru.michaelshell.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private Map<String, Vehicle> cache = new HashMap<>();

    public VehicleRegistry() {
        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("A4");
        car.setTopSpeed(250);

        Bus bus = new Bus();
        bus.setBrand("Scania");
        bus.setModel("400");
        bus.setPassengerCapacity(100);

        cache.put("Audi A4", car);
        cache.put("Scania 400", bus);
    }

    public Vehicle get(String key) {
        return cache.get(key).clone();
    }

}
