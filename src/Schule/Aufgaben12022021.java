package Schule;

public class Aufgaben12022021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="Cola im Kühlschrank \nHol eine raus und lass sie rumgehen.";
		int cola = 10;
		String Flasche =""; 
		while (cola >=1) {
			if (cola == 1) {
				Flasche=" Flasche ";
			}else {
				Flasche=" Flaschen ";
			}
			System.out.println(cola+Flasche+text);
			cola =cola-1;
		}
	}

}
