package com.example.demo;

public final class SingleTonClass {
//    Getter
    private static SingleTonClass obj ;

    private SingleTonClass() {}

    public synchronized static SingleTonClass getInstance() {
        if(obj == null)
            obj = new SingleTonClass();
        return obj;
    }
}

class Demo implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Demo());
        Thread thread2 = new Thread(new Demo());
        Thread thread3 = new Thread(new Demo());
        Thread thread4 = new Thread(new Demo());
        Thread thread5 = new Thread(new Demo());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    public void run() {
        for (int i = 0 ; i < 10000 ; i++) {
            System.out.println(SingleTonClass.getInstance());
        }
    }
}
