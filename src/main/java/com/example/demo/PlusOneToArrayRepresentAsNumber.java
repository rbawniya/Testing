package com.example.demo;

public class PlusOneToArrayRepresentAsNumber {
    public static void main(String[] args) {
        int[] num = {1,2,4};
        String temp = "";
        for(int i = 0; i< num.length; i ++) {
            temp = temp.concat(String.valueOf(num[i]));
        }

        System.out.println(Integer.parseInt(temp)+1);
    }
}
