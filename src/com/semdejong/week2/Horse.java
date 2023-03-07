package com.semdejong.week2;

public class Horse {
    private String name;
    private int height;

    public Horse(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void run(){
        System.out.println("Gallop Gallop Gallop");
    }

    public static void soundOfHourse(){
        System.out.println("HiHIhIhI");
        LoopExample.main(null);
    }

    //Accepts name and height, where height must be > -1 and sets the fields accordingly
    public void setNameAndHeight(String name, int height){
        if(height < 0){
            return;
        }
        this.name = name;
        this.height = height;
    }
}
