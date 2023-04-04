package com.semdejong.week5;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);

        System.out.println("How many items do you want in your array?");

        int amount = scan.nextInt();

        int[] items = new int[amount];

      System.out.println("Which items do you want to add to your list? Split by a space.");
//
//        scan.nextLine();
//
//            String[] nums = scan.nextLine().split("\\s+");


        for(int i = 0; i < amount; i++){
            items[i] = scan.nextInt();
        }

//            for (int i = 0; i < nums.length; i++) {
//                items[i] = Integer.parseInt(nums[i]);
//            }

            System.out.println(Arrays.toString(items));

//        for(int j = 0; j < items.length; j++){
//            int value = items[j];
//
//            for(int i = 0; i < value; i++){
//                System.out.print("*");
//            }
//
//            System.out.println(" (" + value + ")");
//        }

        for(int item : items){

            for(int i = 0; i < item; i++){
                System.out.print("*");
            }

            System.out.println(" (" + item + ")");
        }

    }
}
