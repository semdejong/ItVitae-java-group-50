package com.semdejong.week1;

import java.util.Scanner;

public class LightSwitch {
    static boolean lampState = false;

    /*
    * Method to turn lamp on
    * Rules: Lamp can't be turned on when lamp is already on.
    * return type void.
    */
    public static void turnOn(){
        if(lampState){
            return;
        }

        lampState = true;
    }

    /*
     * Method to turn lamp off
     * Rules: Lamp can't be turned off when lamp is already off.
     * return type void.
     */
    public static void turnOff(){
        if(!lampState){
            return;
        }

        lampState = false;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while(true) {

            if (lampState) {
                System.out.println("Lamp is currently on");
            } else {
                System.out.println("Lamp is currently off");
            }

            System.out.println("Type on or off");
            String command = userInput.nextLine();
            if (command.equals("on")) {
                turnOn();
            } else if (command.equals("off")) {
                turnOff();
            } else {
                System.out.println("Not a valid choice");
            }
        }
    }

}
