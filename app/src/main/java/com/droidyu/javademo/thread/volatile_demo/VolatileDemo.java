package com.droidyu.javademo.thread.volatile_demo;

public class VolatileDemo {
    private boolean running = true;

    public static void main(String[] args) {
        new VolatileDemo().runDemo1();
    }

    public void stop() {
        running = false;
    }

    public void runDemo1() {
        System.out.println(Thread.currentThread().getName() + " start");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            while (running) {

            }
            System.out.println(Thread.currentThread().getName() + " end");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
