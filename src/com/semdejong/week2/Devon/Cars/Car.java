package com.semdejong.week2.Devon.Cars;

abstract public class Car {
    private String brand;
    private int amountOfWheels;
    private int amountOfDoors;
    private CarColors carColor;

    public Car(int amountOfWheels, int amountOfDoors, CarColors carColor, String brand) {
        this.amountOfWheels = amountOfWheels;
        this.amountOfDoors = amountOfDoors;
        this.carColor = carColor;
        this.brand = brand;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public CarColors getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColors carColor) {
        if(carColor == CarColors.RED || carColor == CarColors.BLUE) {
            this.carColor = carColor;
        }
    }

    public String getBrand(){
        return brand;
    }
}
