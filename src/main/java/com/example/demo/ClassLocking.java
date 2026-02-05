package com.example.demo;

public class ClassLocking implements Runnable {
    private Printer printer;

    ClassLocking(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Thread thread = new Thread(new ClassLocking(printer1));
        Thread thread1 = new Thread(new ClassLocking(printer2));
        thread1.setName("First Thread");
        thread.setName("Second Thread");
        thread1.setDaemon(true);
        thread.start();
        thread1.start();
    }

    @Override
    public void run() {
        this.printer.print();
    }
}

class Printer {

    void print() {
        synchronized (Printer.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException exception) {

                }
            }
        }
    }
}
