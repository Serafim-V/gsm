package com.javadeveloper.gsm.views;

import java.util.HashMap;

public class TotalView implements View {
    Double totalCost;
    HashMap<String, Double> typeTotalCost;

    public TotalView (Double totalCost, HashMap<String, Double> typeTotalCost) {
        this.totalCost = totalCost;
        this.typeTotalCost = typeTotalCost;
    }
    
    public void print() {
        System.out.println("Общая стоимость расходов на ГСМ - " + totalCost + " руб.");

        for (Object key : typeTotalCost.keySet()) {
            System.out.println("Расход категории \"" + key + "\"  - " + typeTotalCost.get(key) + " руб.");
        }
    }
}
