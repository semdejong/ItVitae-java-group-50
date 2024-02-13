package com.semdejong.Garage;

public class Audi extends Car {

    private boolean isRS;

    public Audi(int weight, int lengthInCM, int heightInCM, int horsePower, boolean isRS) {
        super(weight, lengthInCM, heightInCM, horsePower);
        this.isRS = isRS;
    }

    @Override
    public void horn() {
        System.out.println("Audi hornnnn");
    }
}
