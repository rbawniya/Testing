package com.example.demo;

public class JoiningMethod extends Thread{
    public static void main(String[] args) throws InterruptedException {
        JoiningMethod joiningMethod = new JoiningMethod();
        JoiningMethod joiningMethod1 = new JoiningMethod();
        JoiningMethod joiningMethod2 = new JoiningMethod();

        joiningMethod.start();

        joiningMethod1.start();
        joiningMethod.join();
        joiningMethod2.start();


    }

    @Override
    public void run() {
         for(int i = 0 ; i < 100 ; i++) {
             System.out.println(Thread.currentThread().getName()+"-"+i);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
