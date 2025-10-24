package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class IterateMapByValue {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Banana");
        map.put(1, list);
        map.entrySet().stream().forEach(obj -> obj.getValue().forEach(System.out :: println));
    }
}

