package com.example.demo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchClass {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        CountDownLatchWorker count1 = new CountDownLatchWorker(countDownLatch);
        CountDownLatchWorker count2 = new CountDownLatchWorker(countDownLatch);
        CountDownLatchWorker count3 = new CountDownLatchWorker(countDownLatch);
        CountDownLatchWorker count4 = new CountDownLatchWorker(countDownLatch);

        count1.start();
        count2.start();
        count3.start();
        count4.start();
        countDownLatch.await();

        System.out.println("Main method executed!!");
    }
}

class CountDownLatchWorker extends Thread {
    private CountDownLatch countDownLatch;

    CountDownLatchWorker(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 100; i++)
             System.out.println(Thread.currentThread().getName() +"- Started..."+i);
        try {
            Thread.sleep(100);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
