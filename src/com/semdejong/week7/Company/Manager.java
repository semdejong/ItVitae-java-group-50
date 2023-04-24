package com.semdejong.week7.Company;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name, String address, String phoneNumber, float experienceInYears, int teamSize){
        super(name, address, phoneNumber, experienceInYears);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void sayHi(int amount){
        for (int i = 0; i < amount ; i++){
            System.out.println("hi");
        }
    }

    @Override
    public String toString(){
        return "Dit is een manager met een team grote van " + teamSize;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        Manager manager;

        if(o instanceof Manager){
            manager = (Manager) o;
        }else{
            return false;
        }

        return manager.getName().equals(this.getName());

    }
}
