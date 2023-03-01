package com.semdejong.week1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner semsScanner = new Scanner(System.in);
        System.out.println("Please fill in a number: ");
        int myNumber = semsScanner.nextInt();
        System.out.println("The number that you selected: " + myNumber);
    }
}
