package com.example.demo;

import java.util.Arrays;

public class SwithCase21 {
    public static void main(String[] args) {
        char vowel = 'A';
        switch (vowel) {
            case 'a', 'A', 'i', 'I', 'o', 'O','u','U', 'E', 'e' -> System.out.println("Its Vowel!!");
            default -> System.out.println("Its not vowel!!");
        }

        String name = "Apple";
        System.out.println(name.toLowerCase().matches(".*[aeiou].*"));

    }
}
