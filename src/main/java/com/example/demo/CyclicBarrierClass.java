package com.example.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.*;

public class CyclicBarrierClass {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new CyclicBarrierWorker(cyclicBarrier));
        executorService.submit(new CyclicBarrierWorker(cyclicBarrier));
        executorService.submit(new CyclicBarrierWorker(cyclicBarrier));
        executorService.submit(new CyclicBarrierWorker(cyclicBarrier));
        System.out.println("Main Thread...");
        executorService.shutdown();
    }
}

class CyclicBarrierWorker extends Thread {
    private CyclicBarrier cyclicBarrier;

    CyclicBarrierWorker(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Running 1 step.."+ Thread.currentThread().getName());
        try {
            Thread.sleep(100);
            cyclicBarrier.await();
            System.out.println("Running 2 step.."+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}
