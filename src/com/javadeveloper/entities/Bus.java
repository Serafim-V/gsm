package com.javadeveloper.entities;

public class Bus extends Car {

    private int passengerCount;

    public Bus(String code, String number, int mileage, int passengerCount) {
        super(code, number, mileage);
        this.passengerCount = passengerCount;
        setCostPerLiter(47.5);
        setConsumption(11.5);
        setTypeName("Пассажирский транспорт");
    }

    public double getPassengerCount() {
        return passengerCount;
    }
}
