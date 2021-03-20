package com.javadeveloper.task5.Timer;

public class Main {

    public static final int delay = 1000;
    public static int seconds = 0;

    public static void main(String[] args) throws InterruptedException {

        Bus bus = new Bus();

        Thread thread1 = new Thread(new EverySecond(bus));
        Thread thread2 = new Thread(new EveryFiveSecond(bus));
        thread1.start();
        thread2.start();

        while (true) {

            bus.setMsg(Integer.toString(seconds++));

            Thread.sleep(delay);

        }

    }

}
