package com.semdejong.week7.Company;

import java.util.ArrayList;
import java.util.Arrays;

public class Building {

    public static void main(String[] args) {
        Manager myManager = new Manager("Sem", "Itvitae", "0620222834", 12, 10);
        Programmer myProgrammer = new Programmer("Mark", "Itvitae", "0673849232", 8, new ArrayList<>(Arrays.asList("Java", "JS", "SQL", "C#")));

        Employee e = myManager;
        Employee e2 = myProgrammer;

        System.out.println(e);
        System.out.println(e2);

    }
}