package com.semdejong.week4;

public class BruteForcePinCode {
    public static void main(String[] args) {
        int pincode = 9596;
        for(int i =0; i < 10000; i++){
            if(Integer.toString(pincode).equals(make4digit(i))){
                System.out.println("Pincode found "+ make4digit(i));
                return;
            }else{
                System.out.println("Tried " + make4digit(i) + " but it wasn't correct!");
            }
        }
    }

    public static String make4digit(int num){
        if(num < 10){
            return "000" + num;
        }else if(num < 100){
            return "00" + num;
        }else if(num < 1000){
            return "0" + num;
        }else{
            return "" + num;
        }
    }
}
