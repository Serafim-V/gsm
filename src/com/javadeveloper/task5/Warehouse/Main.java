package com.javadeveloper.task5.Warehouse;

public class Main {

    public static void main(String[] args) {

        int iterate = 20;
        int iterateTime = 1000;
        int goodsCount = 150;

        Warehouse warehouse = new Warehouse(goodsCount);

        Thread thread1 = new Thread(new Provider(warehouse, iterate, iterateTime));
        Thread thread2 = new Thread(new Buyer(warehouse, iterate, iterateTime));
        thread2.start();
        thread1.start();

    }

}
