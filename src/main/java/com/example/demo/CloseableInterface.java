package com.example.demo;

public class CloseableInterface implements AutoCloseable{

    public static void main(String[] args) {
        try(CloseableInterface anInterface = new CloseableInterface()) {
            System.out.println("Hello");
        }
    }

    @Override
    public void close() {
            System.out.println("Calling close method...");
    }
}
