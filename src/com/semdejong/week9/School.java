package com.semdejong.week9;

import java.awt.print.Book;

public class School {

    public static void main(String[] args){
        try {
            giveLecture();
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void giveLecture() throws BookNotFoundException {
        boolean bookFound = false;

        if(!bookFound){
            throw new BookNotFoundException("Book has not been found");
        }
    }
}
