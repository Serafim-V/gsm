package com.javadeveloper.gsm.utils;

import com.javadeveloper.gsm.entities.Car;

import java.util.ArrayList;
import java.util.HashMap;

public class Commands {

    private static ArrayList<Car> cars;

    private static double totalCost = 0;

    private static HashMap typeTotalCost = new HashMap<String, Double>();

    public static void parseCommand(String command, ArrayList<Car> cars) {

        setCars(cars);
        calculate();

        switch (command.split(" ")[0]) {
            case "total":
                total();
                break;
            case "max":
                max();
                break;
            case "min":
                min();
                break;
            case "info":
                info(command.split(" ")[1]);
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Command \"" + command  + "\" not found");
        }
    }

    static private void info(String code) {
        ArrayList<Car> filteredCars = new ArrayList();
        for (Car car : cars) {
            if (car.getCode().equals(code)) {
                filteredCars.add(car);
            }
        }
        ArrayList<Car> sortedCars = new ArrayList();
        for (Car car : filteredCars) {
            if (sortedCars.size() == 0) {
                sortedCars.add(car);
                continue;
            }
            if (car.getMileage() > sortedCars.get(sortedCars.size() - 1).getMileage()) {
                sortedCars.add(car);
                continue;
            }
            for (int i = 0; i < sortedCars.size(); i++) {
                if (car.getMileage() < sortedCars.get(i).getMileage()) {
                    sortedCars.add(i, car);
                    break;
                }
            }
        }

        for (Car car : sortedCars) {
            System.out.println(car.getTypeName() + " " + car.getNumber() + " " + car.getMileage());
        }
    }

    private static void max() {
        String typeCar = "";
        double maxCost = 0;
        for (Object key : typeTotalCost.keySet()) {
            if (maxCost < (double)typeTotalCost.get(key)) {
                maxCost = (double)typeTotalCost.get(key);
                typeCar = key.toString();
            }
        }
        System.out.println("Тип авто имеющий наибольшую стоимость расходов - " + typeCar);
    }

    private static void min() {
        String typeCar = "";
        double minCost = 0;
        for (Object key : typeTotalCost.keySet()) {
            if (minCost == 0) minCost = (double)typeTotalCost.get(key);

            if (minCost > (double)typeTotalCost.get(key)) {
                minCost = (double)typeTotalCost.get(key);
                typeCar = key.toString();
            }
        }
        System.out.println("Тип авто имеющий наименьшую стоимость расходов - " + typeCar);
    }

    private static void total() {
        System.out.println("Общая стоимость расходов на ГСМ - " + totalCost + " руб.");

        for (Object key : typeTotalCost.keySet()) {
            System.out.println("Расход категории \"" + key + "\"  - " + typeTotalCost.get(key) + " руб.");
        }
    }

    private static void setCars(ArrayList<Car> carsIn) {
        cars = carsIn;
    }

    private static void calculate() {
        typeTotalCost.clear();
        for (Car car: cars) {
            totalCost += car.getCost();

            String type = car.getTypeName();

            if (typeTotalCost.containsKey(type)) {
                double typeTotal = (double) typeTotalCost.get(type) + car.getCost();
                typeTotalCost.put(type, typeTotal);
            } else {
                typeTotalCost.put(type, car.getCost());
            }
        }
    }
}
