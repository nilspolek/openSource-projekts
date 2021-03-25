package Schule;
//Nils Polek
import java.util.Scanner;
public class Aufgaben10122020 {
        public static void main(String[]args) {

        	System.out.println("Wie ist dein name ?");
        	Scanner s = new Scanner(System.in);
        	String name = s.nextLine();
        	for (int i=1; i<6; i++)  {
        	 System.out.println("Hallo "+name);
        	}
       }
}