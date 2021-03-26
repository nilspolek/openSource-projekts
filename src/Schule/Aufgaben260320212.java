package Schule;

import java.util.Scanner;

public class Aufgaben260320212 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Willkommen beim Zahlenraten!\nIch denke mir eine Zahl zwischen 0 und 100");

        int rZahl, mZahl, i = 0;
        do {
            rZahl = (int) (Math.random()*100 +1);
            i++;
            System.out.print(i+". Versuch");
            mZahl = s.nextInt();
            if (rZahl < mZahl){
                System.out.println("Meine Zahl ist kleiner!");
            } else
                if(rZahl > mZahl) {
                    System.out.println("Meine Zahl ist größer!");
                } else{
                    System.out.println(rZahl+" ist die Gesuchte Zahl !");
                }
        } while (rZahl != mZahl);
        System.out.println("Du hast " + i + " Versuch(e) gebraucht");
    }
}
