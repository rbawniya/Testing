package com.example.demo;

import java.lang.FunctionalInterface;

public class TestingClass {
    public static void main(String[] args) {
        M1 m = () -> {
            System.out.println("abstract interface method !!");
        };
        m.print2();
        m.print();
    }
}




@FunctionalInterface
interface M1 {
    default void print() {
        System.out.println("Default method !!");
    }

    void print2();
}

class M2 implements M1{
    @Override
    public void print2() {
        System.out.println("Abstract method !!");
    }

    @Override
    public void print() {
        System.out.println("Default method override !!");
    }
}

