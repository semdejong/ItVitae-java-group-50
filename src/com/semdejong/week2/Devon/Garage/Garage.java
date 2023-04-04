package com.semdejong.week2.Devon.Garage;

import com.semdejong.week2.Devon.Cars.Car;

import java.util.ArrayList;

public class Garage {

    private String garageName;
    private ArrayList<Car> cars;

    public Garage(String garageName, ArrayList<Car> cars){
        this.garageName = garageName;
        this.cars = cars;
    }

    public String getGarageName() {
        return garageName;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

}
