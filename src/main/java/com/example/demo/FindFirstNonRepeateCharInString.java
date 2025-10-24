package com.example.demo;

import java.util.LinkedHashMap;

public class FindFirstNonRepeateCharInString {
    public static void main(String[] args) {
        String name = "rajnree";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map.entrySet().stream().filter(obj -> obj.getValue() == 1).findFirst().get().getKey());
    }
}
