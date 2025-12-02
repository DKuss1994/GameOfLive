package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.InstructionGameOfLive.*;


import org.junit.jupiter.api.Test;


class GameOfLiveTest {
    SystemSettingsGameOfLive systemSettingsGameOfLiveTest = new SystemSettingsGameOfLive();







    @Test
    void fieldShouldCreateTest() {
        systemSettingsGameOfLiveTest.setWidth(10);
        systemSettingsGameOfLiveTest.setHeight(10);


        boolean[][] field = systemSettingsGameOfLiveTest.createField();

        // prüft ob Länge stimmt
        assertThat(field.length).isEqualTo(10);
        assertThat(field[0].length).isEqualTo(10);
    }

    @Test
    void fieldShouldDead() {
        systemSettingsGameOfLiveTest.setWidth(10);
        systemSettingsGameOfLiveTest.setHeight(10);
        boolean[][] field = systemSettingsGameOfLiveTest.createField();

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                assertThat(field[x][y]).isFalse();
            }
        }
    }
    @Test
    void overPopulationtest() {
        int ax = 1;
        int ay = 1;
        boolean[][] testfield = {
                {false, false, false},
                {true, false, true},
                {true, true, false}
        };
        boolean[][] field = {
                {false, false, false},
                {true, true, true},
                {true, true, false}
        };
        int count = checkNeighbor(field, ax, ay);
        assertThat(overPopulation(field, ax, ay, count)).isEqualTo(testfield);


    }

    @Test
    void survialTest() {
        int ax = 1;
        int ay = 1;
        boolean[][] testfield = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        boolean[][] field = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        int count = checkNeighbor(field, ax, ay);
        assertThat(survial(field, ax, ay, count)).isEqualTo(testfield);
    }

    @Test
    void underPopulationTest() {
        int ax = 1;
        int ay = 1;
        boolean[][] testfield = {
                {false, false, false},
                {false, false, true},
                {false, false, false}
        };
        boolean[][] field = {
                {false, false, false},
                {false, true, true},
                {false, false, false}
        };
        int count = checkNeighbor(field, ax, ay);
        assertThat(underPopulation(field, ax, ay, count)).isEqualTo(testfield);
    }

    @Test
    void rebornCornerTest() {
        int ax = 0;
        int ay = 0;
        boolean[][] testfield = {
                {true, true, false},
                {true, true, true},
                {false, false, true}
        };
        boolean[][] field = {
                {false, true, false},
                {true, true, true},
                {false, false, true}
        };
        int count = checkNeighbor(field, ax, ay);
        assertThat(reborn(field, ax, ay, count)).isEqualTo(testfield);
    }
    @Test
    void rebornTest() {
        int ax = 1;
        int ay = 1;
        boolean[][] testfield = {
                {true, false, false},
                {false, true, true},
                {false, false, true}
        };
        boolean[][] field = {
                {true, false, false},
                {false, false, true},
                {false, false, true}
        };
        int count = checkNeighbor(field, ax, ay);
        assertThat(reborn(field, ax, ay, count)).isEqualTo(testfield);
    }


    @Test
    void checkNeighborTest1IntheMiddel() {
        int height = 3;
        int width = 3;
        int ax = 1;
        int ay = 1;
        boolean[][] field = createFieldTrue(height, width);

        assertThat(checkNeighbor(field, ax, ay)).isEqualTo(8);
    }

    @Test
    void checkNeighborTest1IntheCorne() {
        int height = 8;
        int width = 8;
        int ax = 0;
        int ay = 0;
        boolean[][] field = createFieldTrue(height, width);


        assertThat(checkNeighbor(field, ax, ay)).isEqualTo(3);
    }

    @Test
    void checkNeighborTest1IntheCorneRight() {
        int height = 8;
        int width = 8;
        int ax = 7;
        int ay = 7;
        boolean[][] field = createFieldTrue(height, width);


        assertThat(checkNeighbor(field, ax, ay)).isEqualTo(3);
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

}


