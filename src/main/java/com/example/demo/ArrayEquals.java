package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayEquals {
    public static void main(String[] args) {
        int num1[] = {12,34,56,7};
        int num2[] = {7,34,12,56};
        if(num1.length == num2.length) {
            Arrays.sort(num1);
            Arrays.sort(num2);
            System.out.println(Arrays.equals(num1, num2) ? "Both Arrays contains same elements" : "Not");
        } else {
            System.out.println("Not");
        }

        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(a1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(a2));

        if(set1.size() == set2.size()) {
            System.out.println(set1.containsAll(set2) ? "Both Arrays contains same elements" : "Not");
        } else
            System.out.println("Not");
    }
}
