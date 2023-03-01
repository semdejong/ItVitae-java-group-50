package com.semdejong.week1;

public class ChessForLoop {
    public static void main(String[] args) {
        for (int height = 8; height >= 1; height--){
            for(int width = 1; width <= 8; width++){
                System.out.print("("+height+", " + width+ ")");
            }
            System.out.println();
        }
    }
}
