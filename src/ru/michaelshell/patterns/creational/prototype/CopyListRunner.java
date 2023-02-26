package ru.michaelshell.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CopyListRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("A4");
        car.setTopSpeed(250);

        Bus bus = new Bus();
        bus.setBrand("Scania");
        bus.setModel("400");
        bus.setPassengerCapacity(100);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bus);
        System.out.println(vehicles);

        List<Vehicle> copyVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) { //here we don't know concrete class
             copyVehicles.add(vehicle.clone());
        }
        System.out.println(copyVehicles);

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        Vehicle audiA4 =vehicleRegistry.get("Audi A4");
        System.out.println(audiA4);
    }

}
