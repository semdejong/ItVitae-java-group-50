package com.semdejong.week8.Casting;

import java.util.ArrayList;

class Auto {
    public void hoink(){
        System.out.println("Toetoet");
    }

}

class Ford extends Auto {

}

class BMW extends Auto {

}

class Opel extends Auto {

}

class Tesla extends Auto {
    public boolean hasScreen(){
        return true;
    }
}

public class CastExample{

    public static void main(String[] args) {
        ArrayList<Auto> myCars = new ArrayList<>();

        Tesla t = new Tesla();
        Auto c = new Tesla();
        Ford f = new Ford();
        BMW b =  new BMW();
        Opel o = new Opel();


        myCars.add(t);
        myCars.add(f);
        myCars.add(b);
        myCars.add(c);

        myCars.add(o);

        //These are the same

//        for (Auto a: myCars) {
//            if(a instanceof Tesla){
//                System.out.println(((Tesla) a).hasScreen());
//            }
//        }


        }
    public static void hasScreen(Auto z){
        if(z instanceof Tesla){
            System.out.println(((Tesla) z).hasScreen());
        }
    }
}