package com.example.demo;

import java.util.HashMap;

public class DistinctAndCountChar {
    public static void main(String[] args) {
        String name = "apple";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < name.length(); i ++) {
            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0)+1);
        }

        map.entrySet().stream().forEach(obj -> System.out.println(obj.getKey()+" count "+obj.getValue()));
    }
}
