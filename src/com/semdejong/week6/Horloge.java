package com.semdejong.week6;

public class Horloge {

    private int time;

    public Horloge(int time){
        this.time = time;
    }

    public static Horloge create(int a){
        return new Horloge(a);
    }
}
