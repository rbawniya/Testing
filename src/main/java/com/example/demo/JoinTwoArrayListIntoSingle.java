package com.example.demo;

import java.util.ArrayList;

public class JoinTwoArrayListIntoSingle {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a2.add("ab");
        a2.add("ac");
        a2.add("ad");
        a3.addAll(a1);
        a3.addAll(a2);
        System.out.println(a3);
    }
}
