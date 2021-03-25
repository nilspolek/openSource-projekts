package Schule;

import java.util.Scanner;

public class Aufgaben220120216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = x;
		String st ="*";
		String st2 =" ";
		if (x<=0) {
			System.out.println("Ein Fehler ist aufgetreten bitte versuche es erneut.");
		}

		for (int i = 1; i<=x; i++) {
			for (int a=1; a<=y; a++) {
				st2=st2+" ";
			}
			st=st+"*";
			System.out.println(st2+st);
			y=y-1;
			st2=" ";
		}
	}

}

