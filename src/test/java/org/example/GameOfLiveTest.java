package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.GameOfLive.createField;
import static org.example.GameOfLive.printField;


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
    void printFieldtest() {
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
        // TODO: später implementieren
    }

}


