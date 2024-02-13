package com.semdejong.week8.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrowing {

    public static void main(String[] args)  {
try {
    divider(4, 0);
}catch (DivideByZeroException e){
    System.out.println("You can not divide by 0");
}

    }

    public static void photoManager() throws PhotoNotFoundException {

        try {
            String result = readFile();
        }catch (FileNotFoundException e){
            throw new PhotoNotFoundException();
        }
    }

    public static void videoManager() throws VideoNotFoundException{
        try {
            String result = readFile();
        } catch (FileNotFoundException e) {
            throw new VideoNotFoundException(e.getMessage());
        }
    }

    public static String readFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("text.txt");

        return "Nice book";
    }

    public static int divider(int a, int b) throws DivideByZeroException{

        if(b == 0){
            throw new DivideByZeroException();
        }

            return a / b;

    }


}
