package com.example.demo;

public class WaitMethod{
    public static void main(String[] args) {
        Message message = new Message("Hello Wait method..");
        Publisher publisher = new Publisher(message);
        Subscriber subscriber = new Subscriber(message);
        new Thread(new Runnable() {
            @Override
            public void run() {
                publisher.get();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                subscriber.accept();
            }
        }).start();
    }
}

class Publisher {
    private Message message;

    Publisher(Message message) {
        this.message = message;
    }

    void get() {
        synchronized (message) {
            System.out.println(message.getMsg()+" Message publish");
            try {
                message.wait();
                System.out.println(message.getMsg()+" Message publish after wait..");
            } catch (InterruptedException exception) {

            }
        }
    }

}

class Subscriber {
    private Message message;
    Subscriber(Message message) {
        this.message = message;
    }

    void accept() {
        synchronized (message) {
            System.out.println(message.getMsg()+" Subscribe the thread ");
            message.notify();
        }
    }
}

class Message {
    private String msg;
    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
