package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;

public class MaximunValueInListOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1245);
        list.add(76);
        list.add(65);


        Integer num = list.stream().sorted(Comparator.comparingInt(Integer :: intValue).reversed()).findFirst().get();
        System.out.println(num);

        System.out.println(list.stream().max(Integer :: compare).get());
    }
}
