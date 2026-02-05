package com.example.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {
    public static void main(String[] args) {
        String[] strArray = { "Scaler", "by", "InterviewBit"};
        String name = Arrays.stream(strArray).collect(Collectors.joining());
        System.out.println(name);
        Arrays.toString(strArray);
    }
}
