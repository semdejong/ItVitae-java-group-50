package com.semdejong.week1;

public class LoopExample {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Waarde van i: " + i);
            //same as: sum = sum + i;
            sum += i;
            System.out.println("Nieuwe waarde van sum: " + sum);
        }

        System.out.println(sum);
    }
}
