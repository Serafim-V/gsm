package com.javadeveloper.task5.Warehouse;

public class Buyer implements Runnable{

    private Warehouse warehouse;
    private int iterate;
    private int iterateTime;
    private int buyedGoodsCount = 60;

    public Buyer(Warehouse warehouse, int iterate, int iterateTime) {
        this.warehouse = warehouse;
        this.iterate = iterate;
        this.iterateTime = iterateTime;
    }

    public void run() {
        for (int i = 0; i < iterate; i++) {

            warehouse.setBuyedGoodsCount(buyedGoodsCount);

            try {
                Thread.sleep(iterateTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}