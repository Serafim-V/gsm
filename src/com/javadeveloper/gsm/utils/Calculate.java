package com.javadeveloper.gsm.utils;

import com.javadeveloper.gsm.entities.Car;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculate {
   public static double totalCost (ArrayList<Car> cars) {
       double totalCost = 0;

       for (Car car: cars) {
           totalCost += car.getCost();
       }

       return totalCost;
   }

   public static HashMap typeTotalCost (ArrayList<Car> cars) {
       HashMap typeTotalCost = new HashMap<String, Double>();

       for (Car car: cars) {

           String type = car.getTypeName();

           if (typeTotalCost.containsKey(type)) {
               double typeTotal = (double) typeTotalCost.get(type) + car.getCost();
               typeTotalCost.put(type, typeTotal);
           } else {
               typeTotalCost.put(type, car.getCost());
           }
       }

       return typeTotalCost;
   }
}
