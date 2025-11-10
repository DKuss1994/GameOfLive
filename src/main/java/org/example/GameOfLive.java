package org.example;
import java.util.Arrays;


public class GameOfLive {
    static void main() {
        int count;
        count = 0;
        boolean[][] field = creatField(3, 3);
    String[][]field_test = new String[3][3];


        for(int x = 0; x<3;x++){
            System.out.println(Arrays.toString(field[x]));
        }

    
        }
    public static boolean[][] creatField(int heidht, int weidht){
        boolean[][] field;
        field = new boolean[heidht][weidht];
        for(int x = 0; x < weidht; x++){
            for (int y = 0; y< heidht; y++){
                field[y][x] = false;
            }
        }
        return field;


    }
    }

