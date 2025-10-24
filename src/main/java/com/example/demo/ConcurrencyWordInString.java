package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcurrencyWordInString {
    public static void main(String[] args) {
       String name = "rajneerebitrajneerebitrebit";
        Pattern pattern = Pattern.compile("rebit");
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.results().count());
    }
}
