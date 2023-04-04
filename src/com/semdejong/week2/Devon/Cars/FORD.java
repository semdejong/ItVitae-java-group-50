package com.semdejong.week2.Devon.Cars;

public class FORD extends Car {
    private String uniqueFordName;
    private boolean isMustang;

    private static int age = 4;


    public FORD(int amountOfWheels, int amountOfDoors, CarColors carColor, boolean isMustang, String uniqueFordName) {
        super(amountOfWheels, amountOfDoors, carColor, "FORD");

        this.isMustang = isMustang;
        this.uniqueFordName = uniqueFordName;
    }

    public String getUniqueFordName() {
        return uniqueFordName;
    }

    public boolean isMustang() {
        return isMustang;
    }

    public static void setAge(int newAge){
        age = newAge;
    }

    public void setUniqueFordName(String newName){
        this.uniqueFordName = newName;
    }
}
