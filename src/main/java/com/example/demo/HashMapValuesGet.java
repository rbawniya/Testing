package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashMapValuesGet {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println(map.values());

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);

        HashSet hashSet = new HashSet();
        hashSet = (HashSet) integers.clone();
    }
}
