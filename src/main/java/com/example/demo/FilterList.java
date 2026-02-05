package com.example.demo;

import java.util.Arrays;

public class FilterList {
    public static void main(String[] args) {
        String[] names = {"apple", "banana", "orange","graphs"};
        Arrays.stream(names).filter(obj -> obj.startsWith("a")).forEach(System.out :: println);
    }

}
