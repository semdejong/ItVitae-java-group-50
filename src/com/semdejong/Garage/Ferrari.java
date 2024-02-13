package com.semdejong.Garage;

public class Ferrari extends Car {
    private boolean isFSport;

    public Ferrari(int weight, int lengthInCM, int heightInCM, int horsePower, boolean isFSport) {
        super(weight, lengthInCM, heightInCM, horsePower);
        this.isFSport = isFSport;
    }

    @Override
    public void horn(){
        System.out.println("Hele luxe toeter");
    }

}
