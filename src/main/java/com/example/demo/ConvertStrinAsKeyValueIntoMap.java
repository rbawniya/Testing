package com.example.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStrinAsKeyValueIntoMap {
    public static void main(String[] args) {
        String[] data = {"name=Alice", "age=30", "city=New York"};
        Arrays.asList(data).stream().map(obj -> obj.split("=")).filter(obj -> obj.length == 2).
                collect(Collectors.toMap(obj -> obj[0], obj1-> obj1[1])).entrySet().forEach(System.out :: println);
    }
}
