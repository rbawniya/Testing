package com.example.demo;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = IntStream.rangeClosed(1,num).reduce(1,(a,b) -> a*b);
        System.out.print(fact);

        int factnum = 1;
        if(num < 0) {
            System.out.println("Invalid Number!!");
        } else {
            for (int i = num; i > 0 ; i --) {
                factnum *= i;
            }
            System.out.println(factnum);
        }
    }
}
