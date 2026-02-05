package com.example.demo.designPattern.solidDesignPattern;

//Single Responsibility Principle This principle states that "A class should have only one reason to change" which means every class should have a single responsibility or single job or single purpose. In other words, a class should have only one job or purpose within the software system.

public class SingleRespponsibilityPrinciple_1 {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.manage();

        Order order = new Order();
        order.createOrder();
    }
}

class InventoryManagement {
    public void manage() {
        System.out.println("Managing inventory...");
    }
}

class Order {
    public void createOrder() {
        System.out.println("Create Order...");
    }
}
