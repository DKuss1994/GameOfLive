package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SystemSettingsGameOfLive {
    private int width;
    private int height;
    private ArrayList<Integer> bewohner;

    public  boolean[][] createField() {
        boolean[][] field;
        field = new boolean[height][width];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                field[y][x] = false;
            }
        }
        return field;


    }
    public  void printField(boolean[][] field) {

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


        }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
