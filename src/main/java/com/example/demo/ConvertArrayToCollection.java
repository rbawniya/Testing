package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertArrayToCollection {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        List<Integer> list = IntStream.of(num).boxed().collect(Collectors.toList());
        ArrayList<Integer> integers = new ArrayList<>(list);
        Collections.shuffle(integers);
        integers.forEach(System.out :: println);
    }
}
