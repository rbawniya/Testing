package com.example.demo;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int num[] = {12,4,7,9,34,2,5,3,1};
        Arrays.sort(num);
        Arrays.stream(num).forEach(System.out :: println);
    }

}
