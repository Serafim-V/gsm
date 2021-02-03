package com.javadeveloper.entities;

public class Crane extends Car {

    private double weightCount;

    public Crane(String number, double mileage, double weightCount) {
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
