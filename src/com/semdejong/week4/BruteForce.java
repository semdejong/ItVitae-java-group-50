package com.semdejong.week4;

import com.semdejong.week3.Encryption;

public class BruteForce {
    public static void main(String[] args) {
        String encrypted = "\u00AD´³©";
       //   String encrypted = "-´³©";


          for(int n = 0; n <101; n++){

              String result = "";
              for(char c : encrypted.toCharArray()){
                  char r = (char) (c + (-1* n));

                  result += r;
              }

              System.out.println(n + ") " + result);
          }

    }

}
