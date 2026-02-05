package com.example.demo.designPattern;

public class PrototypeDesignPattern {
    public static void main(String[] args) {
        ProtoMainClass protoMainClass = new ProtoMainClass(new CircleDrawClass());
        Draw draw = protoMainClass.getObject();
        draw.print();

        protoMainClass = new ProtoMainClass(new RectangleDrawClass());
        draw = protoMainClass.getObject();
        draw.print();
    }
}
class ProtoMainClass {
    public Draw draw;

    ProtoMainClass(Draw draw) {
        this.draw = draw;
    }

    public Draw getObject() {
        return this.draw.copy();
    }
}
interface Draw {
    Draw copy();
    void print();
}

class CircleDrawClass implements Draw {

    @Override
    public Draw copy() {
        return new CircleDrawClass();
    }

    @Override
    public void print() {
        System.out.println("Circle!!");
    }
}

class RectangleDrawClass implements Draw {

    @Override
    public Draw copy() {
        return new RectangleDrawClass();
    }

    @Override
    public void print() {
        System.out.println("Rectangle!!");
    }
}
