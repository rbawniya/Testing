package com.example.demo;

public class DefaulMethodWithSameNameDiffInterface implements A, B {

    @Override
    public void print() {
        B.super.print();
    }

    public static void main(String[] args) {
        DefaulMethodWithSameNameDiffInterface anInterface = new DefaulMethodWithSameNameDiffInterface();
        anInterface.print();
    }
}

interface A {
    default void print() {
        System.out.println("A interface");
    }
}

interface B {
    default void print() {
        System.out.println("B interface");
    }
}
