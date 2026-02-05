package com.example.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(new M10());
        priorityQueue.add(12);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(142);



        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

class M10 implements Comparator<Integer> {
    private int id;



    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == o2)
          return 0;
        else if (o1 > o2) {
            return 1;
        } else
            return -1;
    }
}
