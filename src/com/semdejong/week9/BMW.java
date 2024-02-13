package com.semdejong.week9;

public class BMW extends Car{

    private boolean hasWorkingBlinkers;

    public BMW(int amountOfWheels, String color, boolean hasWorkingBlinkers) {
        super(amountOfWheels, color);
        this.hasWorkingBlinkers = hasWorkingBlinkers;
    }

    public boolean isHasWorkingBlinkers() {
        return hasWorkingBlinkers;
    }

    public void setHasWorkingBlinkers(boolean hasWorkingBlinkers) {
        this.hasWorkingBlinkers = hasWorkingBlinkers;
    }
}
