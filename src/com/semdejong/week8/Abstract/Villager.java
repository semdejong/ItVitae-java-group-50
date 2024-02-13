package com.semdejong.week8.Abstract;

public class Villager extends Enemy{


    @Override
    public void shoot() {

    }

    @Override
    public int calculate(int a, int b){
        System.out.println("Hi Conner");

        return a + b;
    }

    @Override
    String greet() {
        return "Hello";
    }

}
