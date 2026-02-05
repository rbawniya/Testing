package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfArrayElemtns {
    public static void main(String[] args) {
        int num [] = {12,45,3,67,8};
        System.out.println(Arrays.stream(num).sum());
    }
}
