package com.javadeveloper.gsm.views;

import com.javadeveloper.gsm.entities.Car;

import java.util.ArrayList;

public class InfoView implements View {
    ArrayList<Car> cars;

    public InfoView (ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void print() {
        for (Car car : cars) {
            System.out.println(car.getTypeName() + " " + car.getNumber() + " " + car.getMileage());
        }
    }

}
