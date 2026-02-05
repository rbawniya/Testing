package com.example.demo;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int num[] = {0, 1, 0, 1, 1, 1, 1,1,1, 0, 1,1,1,1,1, 0};
        int count = 0, temp = 0 ;
        for(int i = 0; i < num.length; i ++) {
            if(num[i] == 1) {
                temp +=1;
            } else {
                temp = 0;

            }
            if(temp > count)
                count = temp;
        }
        System.out.println(count);
    }
}
