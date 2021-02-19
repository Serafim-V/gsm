package com.javadeveloper.gsm.commands;

import com.javadeveloper.gsm.views.MinView;

import java.util.HashMap;

public class Min {

    public static void execute(HashMap<String, Double> typeTotalCost) {
        String typeCar = "";
        double minCost = 0;

        for (Object key : typeTotalCost.keySet()) {
            if (minCost == 0) minCost = (double)typeTotalCost.get(key);

            if (minCost > (double)typeTotalCost.get(key)) {
                minCost = (double)typeTotalCost.get(key);
                typeCar = key.toString();
            }
        }

        new MinView(typeCar).print();
    }
}
