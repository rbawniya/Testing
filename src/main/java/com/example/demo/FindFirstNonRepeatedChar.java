package com.example.demo;

import java.util.LinkedHashMap;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        String name = "stytihwissrt";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] cr = name.toCharArray();
        for(int i = 0 ; i < cr.length; i++) {
            map.put(cr[i], map.getOrDefault(cr[i], 0)+ 1);
        }
        char fc = map.entrySet().stream().filter(obj -> obj.getValue() == 1).findFirst().get().getKey();
        System.out.println(fc);
    }
}
