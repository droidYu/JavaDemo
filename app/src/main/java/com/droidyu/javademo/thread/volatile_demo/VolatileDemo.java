package com.droidyu.javademo.thread.volatile_demo;

public class VolatileDemo {
    public boolean running = true;

    public void stop() {
        running = false;
    }
}

class Test {
    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        System.out.println(Thread.currentThread().getName() + " start");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            while (demo.running) {

            }
            System.out.println(Thread.currentThread().getName() + " end");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo.stop();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
