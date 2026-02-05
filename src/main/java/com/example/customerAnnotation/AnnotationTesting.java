package com.example.customerAnnotation;

import java.lang.reflect.Field;

public class AnnotationTesting {
    public static void main(String[] args) {
        ABC abc = new ABC();
        for (Field field : abc.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }
}
