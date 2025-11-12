package org.example;

import static org.example.GameOfLive.*;

public class InstructionGameOfLive {



    public static int checkNeighbor(boolean[][] field,int ax, int ay) {
        int count;
        int ny;
        int nx;
        count = 0;
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                ny = ay + y;
                nx = ax + x;
                if (ny < 0 || nx < 0 || nx >= field[0].length || ny >= field.length) {
                    continue;
                }
                if (y == 0 && x == 0) {
                    continue;
                }
                if (field[ny][nx]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean[][] overPopulation(boolean [][] field, int ax, int ay,int count) {
        if (field[ay][ax]) {
            if (count > 3) {
                field[ay][ax] = false;

            }

        }
        return field;
    }
    public static boolean[][] underPopulation(boolean [][] field, int ax, int ay,int count) {
        if (field[ay][ax]) {
            if (count < 2) {
                field[ay][ax] = false;

            }

        }
        return field;
    }


    public static boolean[][] survial(boolean[][] field, int ax, int ay,int count) {
        if (field[ay][ax]) {

            if (count == 3 || count == 2) {
                field[ay][ax] = true;

            }


        }
        return field;
    }
}

