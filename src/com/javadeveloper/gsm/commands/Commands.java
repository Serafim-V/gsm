package com.javadeveloper.gsm.commands;

import com.javadeveloper.gsm.entities.Car;
import com.javadeveloper.gsm.utils.Calculate;

import java.util.ArrayList;
import java.util.HashMap;

public class Commands {

    private ArrayList<Car> cars;
    private double totalCost = 0;
    private HashMap typeTotalCost = new HashMap<String, Double>();

    public Commands (ArrayList<Car> cars) {
        setCars(cars);
        setTypeTotalCost(cars);
        setTotalCost(cars);
    }

    public void execute(String command) {

        switch (command.split(" ")[0]) {
            case "total":
                Total.execute(totalCost, typeTotalCost);
                break;
            case "max":
                Max.execute(typeTotalCost);
                break;
            case "min":
                Min.execute(typeTotalCost);
                break;
            case "info":
                String carCode = command.split(" ")[1];
                Info.execute(carCode, cars);
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Command \"" + command  + "\" not found");
        }
    }

    private void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    private void setTotalCost(ArrayList<Car> cars) {
        this.totalCost = Calculate.totalCost(cars);
    }

    private void setTypeTotalCost(ArrayList<Car> cars) {
        this.typeTotalCost = Calculate.typeTotalCost(cars);
    }

}
