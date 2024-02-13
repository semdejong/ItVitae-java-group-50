package com.semdejong.week9;

import java.util.ArrayList;

public class Garage {

    ArrayList<Car> carSelection;

    public Garage(){
        this.carSelection = new ArrayList<>();
        setup();
    }

    public void setup(){
        carSelection.add(new Audi(4, "gray", true));
        carSelection.add(new BMW(6, "blue", false));
    }

    public void printCarSelection(){
        for (Car car : carSelection) {
          Audi audi = (Audi) car;

        }
    }

    public static void main(String[] args) {
        Garage myGarage = new Garage();

        myGarage.printCarSelection();
    }
}
