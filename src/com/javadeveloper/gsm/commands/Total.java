package com.javadeveloper.gsm.commands;

import com.javadeveloper.gsm.views.TotalView;

import java.util.HashMap;

public class Total {

    public static void execute(Double totalCost, HashMap<String, Double> typeTotalCost) {

        new TotalView(totalCost, typeTotalCost).print();
        
    }
}
