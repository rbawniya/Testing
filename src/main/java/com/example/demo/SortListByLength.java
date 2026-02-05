package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByLength {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("banana");
        names.add("ab");
        names.add("plettff");

       List<String> m= names.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
       m.stream().forEach(System.out :: println);
    }
}
