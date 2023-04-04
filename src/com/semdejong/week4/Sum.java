package com.semdejong.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int num = calc(5,6,7,8,9,2,3,4,6,7);

        System.out.println(num);
    }


    public static int calc(int... numsToCalc){
        int total = 0;
        for(int i : numsToCalc){
            total += i;
        }

        total -= numsToCalc[numsToCalc.length -1];

        return total;
    }
}
