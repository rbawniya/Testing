package com.example.demo;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 115;
        int temp = num, sum = 1;

        for(int i = 2; i <=num; i ++) {

            if(temp % i == 0) {
                sum+=i;
                temp = temp / i;
            }
            if(temp <=1) {
                break;
            }
        }
        if(num == sum) {
            System.out.println("Number is perfect number = "+num);
        } else
            System.out.println("Number is not perfect number = "+num);
    }
}
