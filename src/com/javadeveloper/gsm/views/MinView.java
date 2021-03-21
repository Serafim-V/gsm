package com.javadeveloper.gsm.views;

public class MinView implements View {
    String carType;

    public MinView(String carType) {
        this.carType = carType;
    }

    public void print () {
        System.out.println("Тип авто имеющий наименьшую стоимость расходов - " + carType);
    }
    
}
