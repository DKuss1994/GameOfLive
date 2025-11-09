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

}


