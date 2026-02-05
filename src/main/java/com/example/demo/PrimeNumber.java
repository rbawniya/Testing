package com.example.demo;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 37;
        boolean flag = false;
        if(num == 1) {
            flag = true;
        } else {
            for(int i = 2; i <= num /2 ; i++) {
                if(num % i == 0){
                    flag = false;
                    break;
                } else
                    flag = true;
            }
        }
        if(flag) {
            System.out.println("Number is Prime number!! "+ num);
        } else
            System.out.println("Number is not Prime number!! "+ num);
    }
}
