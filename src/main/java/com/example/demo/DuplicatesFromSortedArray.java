package com.example.demo;

import java.util.stream.IntStream;

public class DuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,6,8,4,3,2,5,6};
        IntStream.of(num).boxed().sorted().distinct().forEach(System.out :: println);
    }
}
