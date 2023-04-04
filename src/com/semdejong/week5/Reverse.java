package com.semdejong.week5;

public class Reverse {
    public static void main(String[] args) {
        String myString = "Lepel";
        StringBuilder builder = new StringBuilder();


        for(int i = myString.length() - 1; i >= 0; i--){
            builder.append(myString.charAt(i));
        }

        System.out.println(builder);

        if(myString.equalsIgnoreCase(String.valueOf(builder))){
            System.out.println("Is a palindroom");

            return;
        }

        System.out.println("Is not a palindroom");


    }
}
