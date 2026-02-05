package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] num = {12, 35, 1, 10, 34, 1};
        int thirdHigh = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(thirdHigh);
    }
}
