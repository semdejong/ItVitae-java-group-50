package com.semdejong.week8.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test {
        public static void main(String args[]){
            try {
                openFile();
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }

        public static void openFile() throws FileNotFoundException{
            FileInputStream fis = new FileInputStream("test.txt");
        }

}



