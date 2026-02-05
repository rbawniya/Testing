package com.example.demo;

import java.util.Arrays;

public class FindStringAnaGram {
    public static void main(String[] args) {
        String name1 = "apple";
        String name2 = "ppael";

        if(name1.length() != name2.length()) {
            System.out.println("Both String is not Anagram");
        } else {
            char[] c1 = name1.toCharArray();
            char[] c2 = name2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1, c2)) {
                System.out.println("both string is Anagram");
            } else {
                System.out.println("Both String is not Anagram");
            }
        }
    }
}
