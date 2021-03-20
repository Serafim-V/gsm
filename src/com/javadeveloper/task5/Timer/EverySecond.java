package com.javadeveloper.task5.Timer;

public class EverySecond implements Runnable{

    public final int delay = 1000;

    public Bus bus;

    public EverySecond (Bus bus) {
        this.bus = bus;
    }

    public void run() {
        while (true) {

            String msg = bus.getMsg();

            if (msg != null && !msg.isEmpty()) {
                System.out.println("Thread 1 - " + bus.getMsg());
            }

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
