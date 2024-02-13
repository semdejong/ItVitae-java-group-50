package com.semdejong.week8.FinalExersise;

import java.util.ArrayList;

public class EqualsExample {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(1);
        myList2.add(2);
        myList2.add(3);

        if(myList.toString().equals(myList2.toString())){
            System.out.println("Lists are the same");
        }
    }
}
