package com.semdejong.week9;

public abstract class Car {

    private int amountOfWheels;

    private String color;

    public Car(int amountOfWheels, String color){
        this.amountOfWheels = amountOfWheels;
        this.color = color;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
