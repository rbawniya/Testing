package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        HashMap<String, Integer> map = new HashMap<>();

        list.stream().forEach(obj -> map.put(obj, obj.length()));

        System.out.println(map);

        Map<String, Integer> m = list.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(m);


    }
}
