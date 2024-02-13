package com.semdejong.week8.Abstract;

public abstract class Enemy implements Attack{

    public void swing(){
        System.out.println("Swinged");
    }


    abstract String greet();
}
