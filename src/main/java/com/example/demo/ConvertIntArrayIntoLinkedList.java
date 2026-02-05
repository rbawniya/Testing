package com.example.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ConvertIntArrayIntoLinkedList {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        Arrays.stream(num).boxed().collect(Collectors.toCollection(LinkedList::new)).forEach(System.out :: println);
    }
}
