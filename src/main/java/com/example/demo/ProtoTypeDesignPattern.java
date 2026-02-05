package com.example.demo;

public class ProtoTypeDesignPattern {
    private Draw draw;
    ProtoTypeDesignPattern(Draw draw) {
        this.draw = draw;
    }

    public static void main(String[] args) {
        ProtoTypeDesignPattern protoTypeDesignPattern = new ProtoTypeDesignPattern(new Circle("Red"));
        Draw d = protoTypeDesignPattern.getShap();
    }

    public Draw getShap() {
        return this.draw.clone();
    }
}

interface Draw {
    void drawShap();
    Draw clone();
}

class Circle implements Draw{

    private String color;

    Circle(String color) {
        this.color = color;
    }

    public void drawShap() {
        System.out.println("Circle draw!!"+this.color);
    }

    public Draw clone() {
        return new Circle(this.color);
    }
}