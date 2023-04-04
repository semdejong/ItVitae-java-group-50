package com.semdejong.week4;

public class OddEvenTest {

    private static boolean isOdd(int input){
        return input % 2 != 0;
    }

    public static void main(String[] args) {
        OddEvenTest kumait = new OddEvenTest();
        System.out.println(OddEvenTest.isOdd(22));
    }
}


