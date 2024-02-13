package com.semdejong.week8.Exceptions;

public class PhotoNotFoundException extends Exception{
    public PhotoNotFoundException(){
        super("Photo can not be found.");
    }
}
