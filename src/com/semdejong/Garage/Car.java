package com.semdejong.Garage;

public abstract class Car implements useHorn{
    private int weight;
    private int lengthInCM;
    private int heightInCM;
    private int horsePower;

    public Car(int weight, int lengthInCM, int heightInCM, int horsePower) {
        this.weight = weight;
        this.lengthInCM = lengthInCM;
        this.heightInCM = heightInCM;
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLengthInCM() {
        return lengthInCM;
    }

    public void setLengthInCM(int lengthInCM) {
        this.lengthInCM = lengthInCM;
    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(int heightInCM) {
        this.heightInCM = heightInCM;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
