package org.example;
import static org.assertj.core.api.Assertions.assertThat;
import static org.example.GameOfLive.creatField;

import org.junit.jupiter.api.Test;

public class GameOfLiveTest {


    @Test
    void fieldShouldCreate() {
        int height;
        int weidht;
        height = 10;
        weidht = 10;


        boolean [][] field = creatField(height,weidht);
        //prüft ob länge gleich länge ist
        assertThat(field.length).isEqualTo(height);
        assertThat(field[0].length).isEqualTo(weidht);


    }
    @Test
    void fieldShouldDead(){
        int height;
        int weidht;
        height = 10;
        weidht = 10;

        boolean[][] field = creatField(height,weidht);
        for(int x = 0; x<field.length;x++){
            for(int y = 0; y<field[x].length;y++){
                assertThat(field[y][x]).isEqualTo(false);

            }
        }

    }

}


