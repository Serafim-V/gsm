package com.javadeveloper.task5.Timer;

public class EveryFiveSecond implements Runnable {
    public final int delay = 5000;

    public Bus bus;

    public EveryFiveSecond (Bus bus) {
        this.bus = bus;
    }

    public void run() {
        while (true) {

            String msg = bus.getMsg();

            if (msg != null && !msg.isEmpty()) {
                System.out.println("Thread 2 - " + bus.getMsg());
            }

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
