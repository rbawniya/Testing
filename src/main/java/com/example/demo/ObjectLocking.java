package com.example.demo;

public class ObjectLocking extends Thread {

    private Display display;

    ObjectLocking(Display display) {
        this.display = display;
    }

    public static void main(String[] args) {
        Display display1 = new Display();
        ObjectLocking locking1 = new ObjectLocking(display1);
        ObjectLocking locking2 = new ObjectLocking(display1);
        locking1.start();
        locking2.start();

    }

    @Override
    public void run() {
        try {
            display.method();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class Display {
    void method() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "- " + i);
                Thread.sleep(500);
            }
        }
    }
}
