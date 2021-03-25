package Schule;
import java.util.Scanner;
public class Aufgaben05022021 {

	static double fin=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie den Grundbetrag 1 ein: ");
		double grund1 = s.nextInt();
		System.out.println("Geben sie den Grundbetrag 2 ein: ");
		double grund2 = s.nextInt();
		System.out.println("Geben sie den Kilometerpreis 1 ein: ");
		double kpk1 = s.nextInt();
		System.out.println("Geben sie den Kilometerpreis 2 ein: ");
		double kpk2 = s.nextInt();
		System.out.println("Geben sie den maximalbetrag 1 ein:");
		double max1 = s.nextInt();
		System.out.println("Geben sie den maximalbetrag 2 ein:");
		double max2 = s.nextInt();
		double bet1 =0;
		double bet2 =0;
		ber(bet2, bet1, max2, max1, kpk2, kpk1, grund2, grund1);
		System.out.println(fin);
	}
	static void ber(double bet2, double bet1 , double max2, double max1, double kpk2, double kpk1, double grund2, double grund1) {
		bet1=grund1*max1;
		bet2=grund2*max2;
		if (bet1>bet2) {
			fin=bet1;
		}
		else {
			fin=bet2;
		}
	}
	
}
