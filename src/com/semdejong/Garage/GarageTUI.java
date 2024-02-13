package com.semdejong.Garage;

import java.util.ArrayList;
import java.util.Scanner;

public class GarageTUI {
    static ArrayList<Garage> garages;
    public static void main(String[] args) {

        garages = new ArrayList<>();

        while(true) {
            System.out.println("#### WELCOME TO YOUR GARAGE MANAGER - SELECT AN OPTION ####");
            System.out.println("  -- 1). List All Garages.");
            System.out.println("  -- 2). Create a Garage.");
            System.out.println("#### ------------------------------------------------- ####");

            Scanner sc = new Scanner(System.in);

            int choiceToInt;
            while (true) {
                if (sc.hasNextInt()) {
                    choiceToInt = sc.nextInt();
                    sc.nextLine();

                    if (choiceToInt == 1) {
                        if (garages.size() > 0) {
                            for (Garage garage : garages) {
                                System.out.println("#" + (garages.indexOf(garage) + 1) + " name: " + garage.getName() + "   amount of cars:" + garage.amountOfCars() + ".");
                            }
                        } else {
                            System.out.println("You don't have any garages yet.");
                        }
                    }

                    if (choiceToInt == 2) {
//                        Scanner garageName = new Scanner(System.in);
                        System.out.print("## Name of your new garage: ");
                        String name = sc.nextLine();
                        garages.add(new Garage(name));
                    }

                    break;
                } else {
                    System.out.println("Input must be an int");
                }
                sc.nextLine();
            }
        }


    }
}
