package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

              matrica();

            rotated(SIZE, colors);


    }
    public static int[][] matrica(){
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        System.out.println("исходная матрица: ");
        Random random = new Random();
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        return colors;
    }


    public static int[][] rotated(int SIZE, int[][] colors){

        System.out.println("Перевернутая матрица:");
        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i<SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                rotatedColors[j][i] = colors[SIZE-i-1][j];
            }
        }

        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }

        return rotatedColors;

    }
}