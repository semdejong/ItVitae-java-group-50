
package com.semdejong.week2;


class Medewerker {
    String naam;
    static int kluiscode;
}

class TestMedewerker {
    public static void main(String[] args) {
        Medewerker med1 = new Medewerker();
        Medewerker med2 = new Medewerker();
        med1.kluiscode = 12345;
        med2.kluiscode = 54321;
        System.out.println(med1.kluiscode); // print 54321, want de code is aangepast door med2
        System.out.println(med2.kluiscode); // print 54321
        System.out.println(Medewerker.kluiscode); // print 54321
    }
}

