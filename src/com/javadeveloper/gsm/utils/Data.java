package com.javadeveloper.gsm.utils;

import com.javadeveloper.gsm.entities.Bus;
import com.javadeveloper.gsm.entities.Car;
import com.javadeveloper.gsm.entities.Crane;
import com.javadeveloper.gsm.entities.Truck;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Car> parseInputString(String[] data) {
        ArrayList cars = new ArrayList<Car>();

        for(String codeCar: data) {
            Car car = parseCode(codeCar);
            cars.add(car);
        }

        return cars;
    }

    public static Car parseCode (String codeCar) {

        String code = codeCar.substring(1,4);

        String[] parsedCarCode = codeCar.split("-");

        String number = parsedCarCode[0].replaceAll(".+_", "");
        String mileage = parsedCarCode[1];
        String param = "";
        Car car;
        if (code.equals("100")) {
            car = new Car(code, number, Integer.parseInt(mileage));
        } else {
            param = parsedCarCode[2];
            car = createCar(code, number, Integer.parseInt(mileage), Integer.parseInt(param));
        }
        return car;
    }

    private static Car createCar (String code, String number, int mileage, int param) {
        Car car;
        switch (code) {
            case "200":
                car = new Truck(code, number, mileage, param);
                break;
            case "300":
                car = new Bus(code, number, mileage, param);
                break;
            default:
                car = new Crane(code, number, mileage, param);
                break;
        }
        return car;
    }
}
