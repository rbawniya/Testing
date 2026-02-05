package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(45);
        list.add(76);
        list.add(43);

        list.descendingIterator().forEachRemaining(System.out :: println);
    }
}
