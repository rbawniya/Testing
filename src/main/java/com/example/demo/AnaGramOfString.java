package com.example.demo;

import java.util.Arrays;

public class AnaGramOfString {
    public static void main(String[] args) {
        String n1 = "apple";
        String n2 = "papelb";

        if(n1.length() == n2.length()) {
            char[] c1 = n1.toCharArray();
            char[] c2 = n2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1, c2)) {
                System.out.println("Both String is Anagram!!");
            } else {
                System.out.println("Both String is not Anagram!!");
            }
        } else {
            System.out.println("Both String is not Anagram!!");
        }
    }

}
