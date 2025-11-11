package org.example;

import java.util.Arrays;


public class GameOfLive {
    static int count;
    static int height;
    static int width;

    public static void main(String[] args) {
        width = 3;
        height = 3;



        boolean[][] field = createField(height, width);
        String[][] goodField = printField(field);
        for (int y = 0; y < goodField.length; y++) {
            System.out.print(Arrays.toString(goodField[y]) + "\n");

        }


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

    public static boolean[][] createFieldTrue(int height, int width) {
        boolean[][] field;
        field = new boolean[height][width];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                field[y][x] = true;
            }
        }
        return field;


    }

    public static String[][] printField(boolean[][] field) {

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
        return printField;
    }

    public static int checkNeighbor(int ax, int ay, int height, int width) {
        int count;
        int ny;
        int nx;
        boolean[][] field = createFieldTrue(height, width);
        count = 0;
        for(int y = -1; y<=1;y++){
            for(int x = -1;x<= 1;x++){
                ny =ay+ y;
                nx = ax + x;
                if(ny<0||nx<0||nx>=width||ny>=height){
                    continue;
                }
                if (y==0&&x==0){
                    continue;
                }
                if (field[ny][nx]){
                    count++;
                }
            }
        }



        return count;
    }
    public static boolean[][] generation(int ax, int ay, int height, int width){
        int count;
        boolean [][] field = createFieldTrue(height,width);
        count = checkNeighbor(ax,ay,height,width);
        if(field[ay][ax]){
            // Überbevölkerung
            if(count>3){
                field[ay][ax] = false;

            }


        }

        return field;

    }
}

