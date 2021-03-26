package Schule;

public class Aufgaben26032021 {
    public  static void main (String[] args){
        int augen, versuche = 0;

        do{
            augen= (int) (Math.random()*6 +1);
            versuche++;

        } while (augen != 6);

        System.out.println("Es wurden "+versuche+" gebraucht.");
    }
}
