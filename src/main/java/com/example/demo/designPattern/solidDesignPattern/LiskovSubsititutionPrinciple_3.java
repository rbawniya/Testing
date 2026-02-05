package com.example.demo.designPattern.solidDesignPattern;

//"Derived or child classes must be substitutable for their base or parent classes". This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behaviour.
public class LiskovSubsititutionPrinciple_3 {
    public static void main(String[] args) {

    }
}


class Rectangle {
    private int height;
    private int width;
    Rectangle() {}
    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

}

class Squar extends Rectangle {
    Squar(int height) {
        super(height, height);
    }
}
