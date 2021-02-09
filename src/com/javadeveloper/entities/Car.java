package com.javadeveloper.entities;

public class Car {

    private String code;

    private String number;

    private int mileage;

    private double costPerLiter = 46.10;

    private double consumption = 12.5;

    private String typeName = "Легковой автомобиль";

    public Car (String code, String number, int mileage) {
        this.code = code;
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

    public String getTypeName() {
        return typeName;
    }

    public double getCostPerLiter() {
        return this.costPerLiter;
    }

    public double getMileage() {
        return mileage;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }
}
