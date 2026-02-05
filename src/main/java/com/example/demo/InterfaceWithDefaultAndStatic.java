package com.example.demo;

public class InterfaceWithDefaultAndStatic implements DemoInterface{
    public static void main(String[] args) {
        InterfaceWithDefaultAndStatic interfaceWithDefaultAndStatic = new InterfaceWithDefaultAndStatic();
        interfaceWithDefaultAndStatic.print();
        DemoInterface.get();
    }
}


interface DemoInterface {
    default void print() {
        System.out.println("default method!!");
    }

    static void get() {
        System.out.println("GetMethod!!");
    }
}
