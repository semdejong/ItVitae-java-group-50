package com.semdejong.week1;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Please choose a number between (0 and 6)");
//        int day = userInput.nextInt();

        int day = 2;

        if(day == 0){
            System.out.println("Today is sunday.");
        }else if (day == 1){
            System.out.println("Today is monday");
        }else if (day == 2){
            System.out.println("Today is tuesday");
        }else if (day == 3){
            System.out.println("Today is wednesday");
        }else if (day == 4){
            System.out.println("Today is thursday");
        }else if (day == 5){
            System.out.println("Today is friday");
        }else if (day == 6){
            System.out.println("Today is saturday");
        }else {
            System.out.println("This day is not valid.");
        }
    }
}
