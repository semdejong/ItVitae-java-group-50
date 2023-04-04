package com.semdejong.week2;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("continue:");
        //What will it print here?
        continueExample();
        System.out.println("break:");
        //What will it print here?
        breakExample();
    }

    public static void continueExample(){
        for(int i = 0; i <= 100; i++){
            if(i == 10){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void breakExample(){
        for(int i = 0; i <= 100; i++){
            if(i == 10){
                break;
            }
            System.out.println(i);
        }
    }
}
