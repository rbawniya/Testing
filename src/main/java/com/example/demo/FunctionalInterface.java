package com.example.demo;

public class FunctionalInterface {
    public static void main(String[] args) {

        FunctionalOInter obj = (num) -> {
            System.out.print("Functiona interface!!"+ num);
        } ;

        obj.print(10);
    }
}

@java.lang.FunctionalInterface
interface FunctionalOInter {
    void print(int num);
}
