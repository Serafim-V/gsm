package com.javadeveloper.entities;

public class Truck extends Car {

    private double capacity;

    public Truck (String number, double mileage, double capacity) {
        super(number, mileage);
        this.capacity = capacity;
        setCostPerLiter(48.9);
        setConsumption(12);
        setTypeName("Грузовой автомобиль");
    }

    public double getCapacity() {
        return capacity;
    }
}
