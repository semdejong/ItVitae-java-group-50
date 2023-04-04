package com.semdejong.week2.Devon.Cars;

public class BMW extends Car{

    private boolean isMSport;
    private boolean hasWorkingBlinkers;

    public BMW(int amountOfWheels, int amountOfDoors, CarColors carColor, boolean isMSport, boolean hasWorkingBlinkers) {
        super(amountOfWheels, amountOfDoors, carColor, "");
        this.isMSport = isMSport;
        this.hasWorkingBlinkers = hasWorkingBlinkers;
    }

    public boolean isMSport() {
        return isMSport;
    }

    public boolean isHasWorkingBlinkers() {
        return hasWorkingBlinkers;
    }

    public void setHasWorkingBlinkers(boolean hasWorkingBlinkers) {
        this.hasWorkingBlinkers = hasWorkingBlinkers;
    }
}
