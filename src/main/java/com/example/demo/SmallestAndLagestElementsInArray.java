package com.example.demo;

import java.util.Arrays;

public class SmallestAndLagestElementsInArray {
    public static void main(String[] args) {
        int[] num = {12,3,4,5,67,98,90,456,3456,12234};
        Arrays.sort(num);
        System.out.println(num[0] +" largest = "+num[num.length - 1]);
        int small = num[0], large = num[1];

        for(int m  : num) {
            if(m < small) {
                small = m;
            } else if(m > large) {
                large = m;
            }
        }
        System.out.println(small +" largest = "+large);
    }
}
