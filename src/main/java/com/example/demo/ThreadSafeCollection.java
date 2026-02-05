package com.example.demo;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollection {
    public static void main(String[] args) {
        //        Thread safe #1
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

//        Thread safe #2
        synchronized (list) {
            list.add(12);
        }

        //        Thread safe #3
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    }
}
