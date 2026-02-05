package com.example.demo;

public class PalindromString {
    public static void main(String[] args) {
        String name = "ApfpAwe";
        String subStr = "";
        for(int i = name.length()-1 ; i > name.length() /2 ; i--) {
           subStr = subStr.concat(name.charAt(i)+"");
        }
        System.out.println(subStr+" "+name.substring(0, name.length()/2));
        if(subStr.equals(name.substring(0, name.length()/2))) {
            System.out.println("String is Palindrome!!");
        } else {
            System.out.println("String is not Palindrome!!");
        }
    }
}
