package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UserQuestion {
    private int height;
    private int width;
    Scanner sc = new Scanner(System.in);

    public void setSpielfeldHeightAndWidth() {
        setHeight();
        setWidth();
    }

    private void setHeight() {


        while (true) {
            System.out.print("Bitte gib die höhe des Spielfeldes ein: ");

            try {
                int wert = sc.nextByte();

                if (wert > 0) {
                    this.height = wert;
                    return;
                } else {
                    System.out.println("Der Wert muss größer als 0 sein.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }

    private void setWidth() {


        while (true) {
            System.out.print("Bitte gib die breite des Spielfeldes ein: ");

            try {
                int wert = sc.nextByte();

                if (wert > 0) {
                    this.width = wert;
                    return;
                } else {
                    System.out.println("Der Wert muss größer als 0 sein.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}




