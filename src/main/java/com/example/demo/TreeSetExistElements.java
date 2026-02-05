package com.example.demo;

import java.util.TreeSet;

public class TreeSetExistElements {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("graphs");

        strings.stream().filter(obj -> obj.contains("apple")).forEach(System.out :: println);
    }
}
