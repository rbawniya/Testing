package com.example.demo;

import java.util.ArrayList;

public class ListContainsOnlyOddNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(670);
        list.add(55);
        Long count = list.stream().filter(obj -> obj % 2 == 0).count();
        System.out.println(count > 0 ? "List contains Even number as well" : "List contains only Odd number!!");
    }
}
