package com.javadeveloper.entities;

public class Car {

    private String number;

    private double mileage;

    private double costPerLiter = 46.10;

    private double consumption = 12.5;

    private String typeName = "Легковой автомобиль";

    public Car (String number, double mileage) {
        this.number = number;
        this.mileage = mileage;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setCostPerLiter(double costPerLiter) {
        this.costPerLiter = costPerLiter;
    }

    public double getCost () {
        double cost = getMileage() * consumption * costPerLiter;
        return cost;
    }

    public double getCostPerLiter() {
        return this.costPerLiter;
    }

    public double getMileage() {
        return mileage;
    }
}