package com.javadeveloper.task5.Warehouse;

public class Warehouse {
    private int goodsCount;
    private int maxGoodsCount = 210;

    public Warehouse(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public synchronized void setGoodsCount(int goods) {
        this.goodsCount = goods;
    }

    public synchronized void setBuyedGoodsCount(int buyedGoodsCount) {
        if (goodsCount - buyedGoodsCount > 0) {
            System.out.println("- " + buyedGoodsCount + " единиц, стало: " + (goodsCount - buyedGoodsCount) + " единиц");
            setGoodsCount(goodsCount - buyedGoodsCount);
        } else {
            System.out.println("Не хватает товаров для отгрузки");
        }

    }

    public synchronized void setProvidedGoodsCount(int providedGoodsCount) {
        if (goodsCount + providedGoodsCount < maxGoodsCount) {
            System.out.println("+ " + providedGoodsCount + " единиц, стало: " + (goodsCount + providedGoodsCount) + " единиц");
            setGoodsCount(goodsCount + providedGoodsCount);
        } else {
            System.out.println("+ " + providedGoodsCount + " единиц, Склад не может принять товар");
        }
    }
}
