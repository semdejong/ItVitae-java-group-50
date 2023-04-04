package com.semdejong.week4.ThisExample;

public class Punt {
    double x, y;

    public Punt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void test(Punt p){
        Punt x = p;
    }

    public Punt getPunt(){
        return this;
    }
}
