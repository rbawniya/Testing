package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharInString {
    public static void main(String[] args) {
        String name = "apwerle";

        HashSet<Character> set = new HashSet<>();
        boolean flag = true;
        for(char c : name.toCharArray()) {
            if(!set.add(c)) {
                flag = false;
            }
        }

        if(flag)
            System.out.print("All chars are uniques!!");
        else
            System.out.print("All chars are not uniques!!");
       long size =  name.chars().distinct().count();
        if(size == name.length()) {
            System.out.print("All chars are uniques!!");
        } else {
            System.out.print("not");
        }
    }
}
