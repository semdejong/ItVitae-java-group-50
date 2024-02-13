package com.semdejong.week8.Exceptions;

public class VideoNotFoundException extends Exception{
    public VideoNotFoundException(String message){
        super(message);
    }

    public VideoNotFoundException(){
        super();
    }
}
