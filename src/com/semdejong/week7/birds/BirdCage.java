package com.semdejong.week7.birds;

import java.util.ArrayList;

public class BirdCage {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();

        birds.add(new Merel(true));
        birds.add(new Dove());

        for (Bird bird : birds){
            bird.whistle("");

        }
    }
}
