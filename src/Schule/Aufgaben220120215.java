package Schule;

import java.util.Scanner;

public class Aufgaben220120215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String st ="*";
		if (x<=0) {
			System.out.println("EIn Fehler ist aufgetreten bitte versuche es erneut.");
		}
		for (int i = 1; i<=x; i++) {
			
			System.out.println(st);
			st=st+"*";
		}
	}

}

