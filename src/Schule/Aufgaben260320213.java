package Schule;

import java.util.Scanner;

public class Aufgaben260320213 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        int mZahl, gZahl = 0;

        System.out.println("Bitte Zahlen eingeben, die addiert werden sollen:");
        do {
            mZahl = s.nextInt();
            gZahl += mZahl;
        } while (mZahl != 0);
        System.out.println("Summe ist " + gZahl);
    }
}
