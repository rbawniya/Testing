package com.example.demo;

import java.util.concurrent.*;

public class CallableInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> task = ()-> {
            int sum = 0;
            for(int i = 0 ; i < 5 ; i ++) {
                sum+=i;
            }
            return sum;
        };
        Future<Integer> integerFuture = executorService.submit(task);
        System.out.println(integerFuture.get());
    }
}
