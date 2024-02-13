package com.semdejong.Garage;

public class BMW extends Car{

    private boolean isMSport;
    public BMW(int weight, int lengthInCM, int heightInCM, int horsePower, boolean isMSport) {
        super(weight, lengthInCM, heightInCM, horsePower);
        this.isMSport = isMSport;
    }
}
