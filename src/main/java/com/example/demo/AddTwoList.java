package com.example.demo;

import java.util.ArrayList;

public class AddTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(12);
        list1.add(234);
        list1.add(54);
        list2.add(112);
        list2.add(1);
        list1.addAll(list2);
        System.out.println(list1);
    }
}
