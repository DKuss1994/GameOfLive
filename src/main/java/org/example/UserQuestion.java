package org.example;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UserQuestion {
    private int height;
    private int width;
    private int y;
    private int x;
    private boolean stop = true;

    Scanner sc = new Scanner(System.in);


    public void setBewohner() {
            setBewohnerY();
            setBewohnerX();

    }

    private void setBewohnerY() {


        while (true) {
            System.out.print("Bitte gib die Zeile ein zwischen 0 und "+(this.height-1)+": ");

            try {
                int wert = sc.nextByte();

                if (wert >= 0&&wert<this.height) {
                    this.y = wert;
                    return;
                } else if(wert<0){
                    System.out.println("Der Wert muss größer als 0 sein.");
                } else if (wert>this.height) {
                    System.out.println("Der Wert muss kleiner sein als "+(this.height-1)+" sein.");

                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }
    private void setBewohnerX() {


        while (true) {
            System.out.print("Bitte gib die Spalte ein zwischen 0 und "+(this.width-1)+": ");

            try {
                int wert = sc.nextByte();

                if (wert >= 0&&wert<this.width) {
                    this.x=wert;
                    return;
                } else if(wert<0){
                    System.out.println("Der Wert muss größer als 0 sein.");
                } else if (wert>this.width) {
                    System.out.println("Der Wert muss kleiner sein als "+(this.width-1)+" sein.");

                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop() {
        System.out.print("Möchten Sie das Programm Stopen drücken sie (1)");
        String stop = sc.next();
        if(stop.equals("1")){
            this.stop = true;
        }
        else {
            this.stop = false;
        }

    }
}




