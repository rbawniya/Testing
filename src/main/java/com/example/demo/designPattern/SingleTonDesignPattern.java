package com.example.demo.designPattern;

public class SingleTonDesignPattern extends Thread {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10; i ++) {
            SingleTonDesignPattern pattern = new SingleTonDesignPattern();
            pattern.start();
        }
    }

    @Override
    public void run() {
        SingleTonObject singleTonObject = SingleTonObject.getInstance();
        System.out.println(singleTonObject);

        SingleTonObject singleTonObject1 = SingleTonObject.getInstance();
        System.out.println(singleTonObject1);
    }
}

final class SingleTonObject {
    private static SingleTonObject singleTonObject;

    private SingleTonObject() {

    }

    public synchronized static SingleTonObject getInstance() {
        if(singleTonObject == null)
            singleTonObject = new SingleTonObject();
        return singleTonObject;
    }
}
