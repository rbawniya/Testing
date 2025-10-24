package com.example.demo;

import java.util.LinkedHashMap;

public class FindFirstDuplicateCharInString {
    public static void main(String[] args) {
        String name = "aptpplet";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
       char c=  map.entrySet().stream().filter(obj -> obj.getValue() > 1).findFirst().get().getKey();
       System.out.println("Fist duplicate char is : "+c);
    }
}
