package com.javadeveloper.entities;

public class Crane extends Car {

    private int weightCount;

    public Crane(String number, int mileage, int weightCount) {
        super(number, mileage);
        this.weightCount = weightCount;
        setCostPerLiter(48.9);
        setConsumption(20);
        setTypeName("Тяжелая техника");
    }

    public double getWeightCount() {
        return weightCount;
    }
}
