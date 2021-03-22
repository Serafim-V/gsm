package com.javadeveloper.gsm.commands;

import com.javadeveloper.gsm.entities.Car;
import com.javadeveloper.gsm.views.InfoView;

import java.util.ArrayList;

public class Info {

    public static void execute(String code, ArrayList<Car> cars) {
        ArrayList<Car> filteredCars = new ArrayList();
        ArrayList<Car> sortedCars = new ArrayList();

        for (Car car : cars) {
            if (car.getCode().equals(code)) {
                filteredCars.add(car);
            }
        }

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

        new InfoView(sortedCars).print();
    }

}
