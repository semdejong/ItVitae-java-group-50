package com.semdejong.week7.birds;

public class Merel extends Bird{
    private boolean isMale;

    public Merel(boolean isMale){
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void whistle(String name) {
        System.out.println("Viewt viewt");
    }
}
