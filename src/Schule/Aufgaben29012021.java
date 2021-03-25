package Schule;
import java.util.Scanner;
public class Aufgaben29012021 {
	static void n(int a) {
		int fakultaet = 1;
		for (int i = 1; i <= a; ++i) {
			fakultaet = fakultaet * i;
		}
		System.out.print(fakultaet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie eine Zahl ein");
		int a = s.nextInt();
		n(a);
	}

}
