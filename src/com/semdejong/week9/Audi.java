package com.semdejong.week9;

public class Audi extends Car{

    private boolean isEtron;

    public Audi(int amountOfWheels, String color, boolean isEtron) {
        super(amountOfWheels, color);
        this.isEtron = isEtron;
    }

    public boolean isEtron() {
        return isEtron;
    }

    public void setEtron(boolean etron) {
        isEtron = etron;
    }
}
