package com.javadeveloper.gsm.views;

public class MaxView implements View {
    String carType;

    public MaxView(String carType) {
        this.carType = carType;
    }

    public void print () {
        System.out.println("Тип авто имеющий наибольшую стоимость расходов - " + carType);
    }

}
