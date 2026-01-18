package com.example.demo.designPattern;

//The Abstract Factory Pattern is a creational design pattern that provides an
// interface for creating families of related or dependent objects without specifying their
// concrete classes. It acts as a "factory of factories," where a super-factory creates other
// factories that in turn produce specific objects. This adds a higher level of abstraction,
// allowing systems to switch between different product families easily while keeping the code
// organized and loosely coupled.
public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {
        Vehicles vehicles = new IndianVehicles();
        Car car = vehicles.getCarDetails();
        car.printDetails();
    }
}

interface Car {
    void printDetails();
}

class IndianCar implements Car {
    @Override
    public void printDetails() {
        System.out.println("Indian Car!!");
    }
}

interface Vehicles {
    Car getCarDetails();
}

class IndianVehicles implements Vehicles {
    @Override
    public Car getCarDetails() {
        return new IndianCar();
    }
}