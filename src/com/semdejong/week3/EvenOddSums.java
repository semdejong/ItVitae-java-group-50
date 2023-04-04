package com.semdejong.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOddSums {
    public static void main(String[] args) {
        int i = 0;
        boolean hasCorrectInput = false;
            while (!hasCorrectInput) {
                Scanner scanner = new Scanner(System.in);
                try {
                    i = scanner.nextInt();
                } catch (Exception err) {
                    System.out.println("Please put in a valid positive number!");
                    continue;
                }

                hasCorrectInput = true;
            }
            System.out.println(i);

    }
}
