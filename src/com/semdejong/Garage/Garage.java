package com.semdejong.Garage;

import com.semdejong.week6.Horloge;

import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList<Car> cars;

    public Garage(String name){
        this.name = name;
        cars = new ArrayList<>();
        cars.add(new Audi(1978, 487, 167, 425, true));
        cars.add(new BMW(1234, 384, 146, 124, false));
        cars.add(new Ferrari(1576, 499, 139, 680, true));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int amountOfCars(){
        return cars.size();
    }

    public int sumAllLengths(){
        int length = 0;
        for(Car car : cars){
            length += car.getLengthInCM();
        }

        return length;
    }



}
