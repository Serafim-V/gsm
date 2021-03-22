package com.javadeveloper.gsm.commands;

import com.javadeveloper.gsm.views.MaxView;

import java.util.HashMap;

public class Max {

    public static void execute(HashMap<String, Double> typeTotalCost) {
        String typeCar = "";
        double maxCost = 0;

        for (Object key : typeTotalCost.keySet()) {
            if (maxCost < (double)typeTotalCost.get(key)) {
                maxCost = (double)typeTotalCost.get(key);
                typeCar = key.toString();
            }
        }
        
        new MaxView(typeCar).print();
    }
}
