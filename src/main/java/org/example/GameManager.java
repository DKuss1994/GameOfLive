package org.example;

import java.util.Arrays;

public class GameManager {
    public void startGame() {
        UserQuestion userQuestion = new UserQuestion();
        SystemSettingsGameOfLive systemSettingsGameOfLive = new SystemSettingsGameOfLive();
        userQuestion.setSpielfeldHeightAndWidth();
        systemSettingsGameOfLive.setHeight(userQuestion.getHeight());
        systemSettingsGameOfLive.setWidth(userQuestion.getWidth());
        systemSettingsGameOfLive.printFieldNice();





    }
}
