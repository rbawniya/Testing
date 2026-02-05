package com.example.demo;

public class ThreadLocalVariable extends Thread {
    ThreadLocal<Integer> local = new ThreadLocal<>();
    public static void main(String[] args) {
        ThreadLocalVariable variable = new ThreadLocalVariable();
        ThreadLocalVariable variable1 = new ThreadLocalVariable();
        variable.start();
        variable1.start();
    }

    @Override
    public void run() {
        try {
            local.set(100);
            local.set(local.get()+100);
            Thread.sleep(100);
            System.out.println(local.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
