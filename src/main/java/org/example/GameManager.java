package org.example;


public class GameManager {
    public void startGame() {

        UserQuestion userQuestion = new UserQuestion();
        SystemSettingsGameOfLive systemSettingsGameOfLive = new SystemSettingsGameOfLive();
        // Hier wird die Frage von User erstellt wie hoch und wie breit er das Spielfeld haben will.
        userQuestion.setSpielfeldHeightAndWidth();
        // Hier wird es generiert
        systemSettingsGameOfLive.setHeight(userQuestion.getHeight());
        systemSettingsGameOfLive.setWidth(userQuestion.getWidth());
        systemSettingsGameOfLive.setCreateField();
        while (true) {
            userQuestion.setBewohner();

            if (systemSettingsGameOfLive.getField()[userQuestion.getY()][userQuestion.getX()]) {
                System.out.println("Feld ist bereits belegt!");
                userQuestion.setStop();
                if (userQuestion.isStop()) {
                    break;
                } else {
                    continue;
                }

            }
            systemSettingsGameOfLive.setChangeField(systemSettingsGameOfLive.getField(), userQuestion.getY(), userQuestion.getX());
            systemSettingsGameOfLive.printFieldNice();
            userQuestion.setStop();
            if (userQuestion.isStop()) {
                break;
            }


        }
        int count = 0;
        while (true) {
            systemSettingsGameOfLive.printFieldNice();
            System.out.println("Lebenszyklus "+count);
            systemSettingsGameOfLive.newZyklus();
            count++;

            }
        }
    }



