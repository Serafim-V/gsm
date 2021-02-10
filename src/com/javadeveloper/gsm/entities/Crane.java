package com.javadeveloper.gsm.entities;

public class Crane extends Car {

    private int weightCount;

    public Crane(String code, String number, int mileage, int weightCount) {
        super(code, number, mileage);
        this.weightCount = weightCount;
        setCostPerLiter(48.9);
        setConsumption(20);
        setTypeName("Тяжелая техника");
    }

    public double getWeightCount() {
        return weightCount;
    }
}
