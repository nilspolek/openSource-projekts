package Schule;
import java.util.Scanner;
public class Aufgaben26022021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int zahl=0, zahlmin=2147483647, zahldur=0, zahldurch=0;
		double ent = 0;
		do {
			zahl=s.nextInt();
			zahldur=zahldur+zahl;
			zahldurch++;
			if (zahl<zahlmin && zahl!=0) {
				zahlmin=zahl;
			}
		} while(zahl!=0);
	ent=zahldur/zahldurch;
	System.out.println("Der durchschnitt der Zahlen ist: "+ent);
	System.out.println("Die Kleinste Zahl ist: "+zahlmin);
	}

}
