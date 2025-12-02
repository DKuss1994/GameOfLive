package org.example;

import java.util.Arrays;

public class GameManager {
    public void startGame() {
        UserQuestion userQuestion = new UserQuestion();
        SystemSettingsGameOfLive systemSettingsGameOfLive = new SystemSettingsGameOfLive();
        userQuestion.setSpielfeldHeightAndWidth();
        systemSettingsGameOfLive.setHeight(userQuestion.getHeight());
        systemSettingsGameOfLive.setWidth(userQuestion.getWidth());
        boolean[][] field = systemSettingsGameOfLive.createField();
        systemSettingsGameOfLive.printField(field);
        for (boolean[] booleans : field) {
            System.out.print(Arrays.toString(booleans) + "\n");


        }

    }
}
