package com.semdejong.week4;

public class ScopeTest {
    static double hoogsteCijfer = 100;

    public static double test(){
        String hoogsteCijfer = "";

        System.out.println("Here");
        System.out.println(ScopeTest.hoogsteCijfer);

        return 11;
    }

    public static void main(String[] args) {
        double a = test();
        System.out.println(hoogsteCijfer);
    }
}
