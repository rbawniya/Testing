package com.example.demo;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println(EnumClass.PIN);
        String name = "Rrty";

        name = name.toLowerCase();
        System.out.println(name.matches(".*[aeiou].*"));
        boolean flag = false;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e'|| name.charAt(i) == 'i' || name.charAt(i) == 'o'
            ||name.charAt(i) == 'u') {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("String has Vowel!!");
        } else {
            System.out.println("Spring has not Vowel!!");
        }
    }
}
