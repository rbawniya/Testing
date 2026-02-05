package com.example.demo;

import java.util.HashSet;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String name = "alppleetrtt";
        HashSet<Character> set = new HashSet<>();

        for(char c : name.toCharArray()) {
            if(!set.add(c)) {
                System.out.print(c+" ");

            }
        }
    }
}
