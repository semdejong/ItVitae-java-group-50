package com.semdejong.week7.Company;

import java.util.ArrayList;

public class Programmer extends Employee{
    private ArrayList<String> programmingLanguages;

    public Programmer(String name, String address, String phoneNumber, float experienceInYears, ArrayList<String> programmingLanguages){
        super(name, address, phoneNumber, experienceInYears);
        this.programmingLanguages = programmingLanguages;
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void addProgrammingLanguage(String PL){
        this.programmingLanguages.add(PL);
    }

    public void writeCode(){
        System.out.println("DJNSJDNJND");
    }
}
