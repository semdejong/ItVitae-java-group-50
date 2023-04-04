package com.semdejong.week5;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("test");
        myList.add("test2");
        myList.add(1, "test3");

        System.out.println(myList.get(1));// test 3
        System.out.println(myList.get(2));

    }
}
