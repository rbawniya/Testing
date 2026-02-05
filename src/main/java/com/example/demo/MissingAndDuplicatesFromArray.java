package com.example.demo;

import org.apache.commons.lang3.function.Functions;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingAndDuplicatesFromArray {
    public static void main(String[] args) {
        int num[] = {1,4,6,8,3,1,9};
        Arrays.sort(num);
        int min = num[0], max = num[num.length-1];

        Set<Integer> set = IntStream.of(num).boxed().collect(Collectors.toSet());
        IntStream.rangeClosed(min, max).filter(index -> !set.contains(index)).forEach(obj -> System.out.println("Missing  = "+ obj));

        IntStream.of(num).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(obj -> obj.getValue() > 1).forEach(obj -> System.out.println(obj.getKey()));
    }
}
