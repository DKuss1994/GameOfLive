package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.GameOfLive.*;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;



class GameOfLiveTest {
    int height = 10;
    int width = 10;

    @Test
    void fieldShouldCreateTest() {


        boolean[][] field = createField(height, width);

        // prüft ob Länge stimmt
        assertThat(field.length).isEqualTo(height);
        assertThat(field[0].length).isEqualTo(width);
    }

    @Test
    void fieldShouldDead() {

        boolean[][] field = createField(height, width);

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                assertThat(field[x][y]).isFalse();
            }
        }
    }

    @Test
    void printFieldTest() {
        boolean [][] field = createField(height,width);
        String [][] newField = new String[height][width];
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x]) {
                    newField[y][x] = "■";
                } else {
                    newField[y][x] = " ";
                }

            }
        }
        assertThat(printField(field)).isEqualTo(newField);


    }
    @Test
    void overPopulationtest() {
        height = 3;
        width = 3;
        int ax = 1;
        int ay = 1;
        boolean[][]field = createFieldTrue(height,width);
        field[ax][ay] = false;
        assertThat(overPolpulation(ax,ay,height,width)).isEqualTo(field);

    }
    @Test
    void checkNeighborTest1IntheMiddel(){
        height = 3;
        width = 3;
        int ax = 1;
        int ay = 1;

     assertThat(checkNeighbor(ax,ay,height,width)).isEqualTo(8);
    }
    @Test
    void checkNeighborTest1IntheCorne(){
        height = 8;
        width = 8;
        int ax = 0;
        int ay = 0;

     assertThat(checkNeighbor(ax,ay,height,width)).isEqualTo(3);
    }
    @Test
    void checkNeighborTest1IntheCorneRight(){
        height = 8;
        width = 8;
        int ax = 7;
        int ay = 7;

     assertThat(checkNeighbor(ax,ay,height,width)).isEqualTo(3);
    }

}


