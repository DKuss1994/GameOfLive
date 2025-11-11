package org.example;

import java.util.Arrays;


public class GameOfLive {
    static int count;
    static int height;
    static int width;

    public static void main(String[] args) {
        width = 5;
        height = 5;

        boolean[][] field = createField(height, width);
        printField(field);


    }

    public static boolean[][] createField(int height, int width) {
        boolean[][] field;
        field = new boolean[height][width];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                field[y][x] = false;
            }
        }
        return field;


    }

    public static void printField(boolean[][] field) {

        String[][] printField = new String[field.length][field[0].length];
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x]) {
                    printField[y][x] = "■";
                } else {
                    printField[y][x] = " ";
                }

            }
        }
        for (int y = 0; y < field.length; y++){
        System.out.println(Arrays.toString(printField[y]));}
    }
}

