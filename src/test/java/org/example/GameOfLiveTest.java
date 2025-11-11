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
        PrintStream originalOut = System.out;

        boolean [][] field = createField(height,width);


        String[][] testField = new String[height][width];
        String expected = "";
        for (int y = 0; y < testField.length; y++) {
            for (int x = 0; x < testField[y].length; x++) {
                expected += testField[y][x];
            }
            expected += "\n";
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));
        printField(field);
        String output = out.toString();
        assertThat(output).isEqualTo(expected);
        System.setOut(originalOut);

    }
    @Test
    void overPopulationtest() {
        // TODO: später implementieren
    }

}


