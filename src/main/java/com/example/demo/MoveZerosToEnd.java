package com.example.demo;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 4, 3, 0, 5, 1};
        int count = 0 ;
            for(int i = 0 ; i < num.length ; i ++) {
                if(num[i] != 0) {
                    num[count++] = num[i];
                }
            }

            while(count < num.length) {
                num[count++] = 0;
            }
        for(int n : num ) {
            System.out.println(n);
        }
    }
}
