package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int num[] = {12,45,3,79,89,345,65};
        Arrays.sort(num);
        System.out.println(num);
        System.out.println(num[num.length-2]);
    }
}
