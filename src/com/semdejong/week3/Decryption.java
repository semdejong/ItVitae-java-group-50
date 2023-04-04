package com.semdejong.week3;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to decrypt?");
        String message = scanner.nextLine();

        String result = "";

        for(char c : message.toCharArray()){
            char r = (char) (c + (-1*Encryption.n));

            result += r;
        }

        System.out.println(result);
    }
}
