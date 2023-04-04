package com.semdejong.week2.Devon.Garage;

import com.semdejong.week2.Devon.Cars.BMW;
import com.semdejong.week2.Devon.Cars.Car;
import com.semdejong.week2.Devon.Cars.CarColors;

import java.util.ArrayList;

public class GarageTUI {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new BMW(4, 5, CarColors.SILVER, true, true));
        Garage garage = new Garage("Devons Garage", cars);

        System.out.println(garage.getCars().get(0).getBrand());
    }
}
