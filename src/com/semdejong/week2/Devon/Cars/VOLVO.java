package com.semdejong.week2.Devon.Cars;

public class VOLVO extends Car{
    private boolean isVolvoSport;

    public VOLVO(int amountOfWheels, int amountOfDoors, CarColors carColor, boolean isVolvoSport) {
        super(amountOfWheels, amountOfDoors, carColor, "VOLVO");
        this.isVolvoSport = isVolvoSport;
    }

    public boolean isVolvoSport() {
        return isVolvoSport;
    }
}
