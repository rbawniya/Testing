package com.example.demo;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MergeTwoArryaDistinctSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {3, 5, 9,2};

        ArrayList<Integer> arrayList = new ArrayList<>(IntStream.of(arr1).boxed().toList());
        arrayList.addAll(IntStream.of(arr2).boxed().toList());
        arrayList.stream().distinct().sorted().forEach(System.out :: println);
    }
}
