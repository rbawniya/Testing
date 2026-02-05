package com.example.demo;

import java.util.Arrays;

public class GreatestThreeCandidates {
    public static void main(String[] args) {
        int num[] = {10, 3, 5, 6, 20};
        Arrays.sort(num);
        int sum = num[num.length-1] * num[num.length -2] * num[num.length - 3];
        System.out.println(sum);
    }
}
