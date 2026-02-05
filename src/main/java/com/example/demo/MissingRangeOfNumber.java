package com.example.demo;

public class MissingRangeOfNumber {
    public static void main(String[] args) {
        int[] num = {-48, -10, -6, -4, 0, 4, 17};
        int lower = -54, upper = 17;
        for(int i = 0; i < num.length ; i++) {
            int temp = num[i] - lower;
            if(temp > 1) {
                System.out.println("Missing range = "+lower +","+(lower+temp-1));
            }
            lower = num[i]+1;

            if(i == num.length -1) {
                temp = upper - num[i];
                if(temp > 1) {
                    System.out.println("Missing range = "+lower +","+(lower+temp-1));
                }
            }
        }
    }
}
