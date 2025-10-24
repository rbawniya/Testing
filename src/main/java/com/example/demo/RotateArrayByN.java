package com.example.demo;

public class RotateArrayByN {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6,7};
        int d = 3;
        for(int i = 0; i < d ; i++) {
            int temp = num[0];
            for(int j = 0 ; j < num.length-1 ; j++) {
                num[j] = num[j+1];
            }
            num[num.length -1] = temp;
        }
        for(int n : num ) {
            System.out.println(n);
        }
    }
}
