package org.example;

import java.util.Arrays;


public class GameOfLive {
    static int count;
    static int height;
    static int width;

    static void main() {
        width = 10;
        height = 10;

        boolean[][] field = createField(height, width);


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
        for (int y; y < field.length; y++) {
            for (int x; x < field[y].length; x++) {
                if (field[y][x]) {
                    printField[y][x] = " ";
                } else {
                    printField[y][x] = "0";
                }
            }
        }


    }
}

