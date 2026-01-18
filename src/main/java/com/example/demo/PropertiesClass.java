package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.load(new FileReader("application.properties"));
        System.out.println(properties.getProperty("spring.application.name"));
    }
}
