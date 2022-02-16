package com.droidyu.javademo.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCreate {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyCallable myCallable = new MyCallable();
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(myCallable);
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello MyThread");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello MyRunnable");
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() {
        return "Hello MyCallable";
    }
}
