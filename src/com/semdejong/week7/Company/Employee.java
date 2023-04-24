package com.semdejong.week7.Company;

public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private float experienceInYears;

    public Employee(String name, String address, String phoneNumber, float experienceInYears){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experienceInYears = experienceInYears;
    }

    //Constructor to create employee with 0 years of exp.
    public Employee(String name, String address, String phoneNumber){
        this(name, address, phoneNumber, 0);
    }

    public void sayHi(){
        System.out.println("Hi");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(float experienceInYears) {
        if(experienceInYears < 0){
            return ;
        }
        this.experienceInYears = experienceInYears;
    }

    @Override
    public String toString(){
        return "Dit is een employee met de naam " + name;
     }
}
