package com.semdejong.week3;

import java.util.Scanner;

public class Encryption {
    final static int n = 6;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to encrypt?");
        String message = scanner.nextLine();

        String result = "";

        for(char c : message.toCharArray()){
            char r = (char) (c + n);

            result += r;
        }

        System.out.println(result);
    }
}
