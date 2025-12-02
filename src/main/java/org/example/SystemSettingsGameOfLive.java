package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SystemSettingsGameOfLive {
    private int width ;
    private int height ;
    private ArrayList<Integer> bewohner;
    private boolean [][]field ;



    public  void setCreateField() {
        boolean[][] field;
        field = new boolean[height][width];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                field[y][x] = false;
            }
        }
        this.field = field;


    }

    public  void setChangeField(boolean[][] field,int y, int x) {
                field[y][x] = true;
                this.field = field;
    }

    public  String [][] printField() {
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
        public void printFieldNice() {
            String[][] printField = printField();
            String symbole = "-";
            for (int i = 0; i < field.length; i++) {
                symbole += "---";

            }


            for (String[] x : printField) {

                System.out.print(Arrays.toString(x) + "\n");
                System.out.println(symbole);
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

    public boolean[][] getField() {
        return field;
    }
}
