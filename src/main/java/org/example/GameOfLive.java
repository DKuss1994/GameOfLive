package org.example;

public class GameOfLive {
    static void main() {
        int count;
        System.out.println(creatField(5,5));
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

