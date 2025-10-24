package com.example.demo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableUsingEnumration {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"abc");
        hashtable.put(2, "abcx");
        Enumeration<String> stringEnumeration = hashtable.elements();
        while(stringEnumeration.hasMoreElements()) {
            System.out.println(stringEnumeration.nextElement());
        }
    }
}
