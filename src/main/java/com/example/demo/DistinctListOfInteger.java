package com.example.demo;

import java.util.ArrayList;

public class DistinctListOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(12);

        list.stream().distinct().forEach(System.out :: println);
    }
}
