package com.example.demo.designPattern.solidDesignPattern;

//Interface Segregation Principle
//This principle is the first principle that applies to Interfaces instead of classes in SOLID and it is similar to the single responsibility principle.

public class InterfaceSegregationPrinciple_4 {
    public static void main(String[] args) {
        VegitableRestaurant vegitableRestaurant = new Vegitable();
        vegitableRestaurant.getMenu();

        NonVegitableRestaurant nonVegitableRestaurant = new NonVegitable();
        nonVegitableRestaurant.getNponVegMenu();
    }
}

interface VegitableRestaurant {
    void getMenu();
}

interface NonVegitableRestaurant {
    void getNponVegMenu();
}


class Vegitable implements VegitableRestaurant {
    @Override
    public void getMenu() {
        System.out.println("Veg Menu!!");
    }
}

class NonVegitable implements NonVegitableRestaurant {

    @Override
    public void getNponVegMenu() {
        System.out.println("Non-Veg Menu!!");
    }
}
