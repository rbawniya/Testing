package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ComparatorInSameClass extends Thread {




    public void foo(String s) {
        System.out.println("String");
    }

    public void foo(StringBuffer sb) {
        System.out.println("StringBuffer");
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
         s2 = s2.intern();
        System.out.println(s1 == s2);
    }
}



