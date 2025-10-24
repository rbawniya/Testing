package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedArray {
    public static void main(String[] args) {
        Integer num[] = {1,2,34,56,67};
        List<Integer> list = Arrays.asList(num);
        Collections.reverse(list);
        for(int n : num) {
            System.out.println(n);
        }

    }
}
