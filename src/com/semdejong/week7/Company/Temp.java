package com.semdejong.week7.Company;

class A {
   int a = 3;
}

class B  extends A {
    int a =4;

    int som(){
        return super.a + a;
    }

    void setSuper(int toSet){
        super.a = toSet;
    }
}

public class Temp {
    public static void main(String[] args) {
        B b = new B();

        A a = b;

        System.out.println(b.a);
    }
}
