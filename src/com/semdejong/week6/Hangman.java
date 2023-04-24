package com.semdejong.week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        //Ask for users input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill in the word you want to use:");
        String word = scanner.nextLine().toLowerCase();

        //Make an ArrayList of chars
        ArrayList<Character> listOfChars = new ArrayList<>();

        //Add '_' for every char in word
        for (int i = 0; i < word.length(); i++){
            listOfChars.add(i, '_');
        }

        System.out.println("Let the game begin!");


        int lives = 10;
        int superLive = 1;

        while(!wordGuessed(listOfChars) && lives > 0 && superLive > 0){
            System.out.println("Guess a letter:");
            String guessString = scanner.nextLine().toLowerCase();

            char guess = ' ';
            if(guessString.length() > 1){
                if(word.equals(guessString)){
                    System.out.println("You win!");
                    System.exit(0);
                }else{
                    System.out.println("You loose");
                    System.exit(0);
                }
            }else{
                guess = guessString.charAt(0);
            }


            boolean guessIsRight = false;

            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == guess){
                    listOfChars.set(i, guess);
                    guessIsRight = true;
                }
            }

            if(guessIsRight){
                System.out.println("That is right, your new guess looks like this:");
                System.out.println(charListToString(listOfChars));
            }else{
                lives--;
                System.out.println("Oh no, that is not right, your new guess looks like:");
                System.out.println(charListToString(listOfChars));
                System.out.println("You currently have: " + lives + " lives!");
            }


        }

        if(wordGuessed(listOfChars)){
            System.out.println("You win");
        }else{
            System.out.println("Ah oh you loose.");
        }

    }

    public static boolean wordGuessed(ArrayList<Character> chars){
        return !chars.contains('_');
    }

    public static String charListToString(ArrayList<Character> chars){
        StringBuilder builder = new StringBuilder();

        for (char a: chars) {
            builder.append(a);
        }

        return builder.toString();
    }
}
