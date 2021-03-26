package Schule;

public class Aufgaben260320214 {
    public static void main (String[] args){
        System.out.println("++++++ Mäxchen +++++++");
        int rZahl1, rZahl2, gesammt = 0, maexchen = 0, wuerfe = 0;
        double maexchenpro;
        do {
            rZahl1 = (int) (Math.random()*6 +1);
            rZahl2 = (int) (Math.random()*6 +1);

            wuerfe++;

            if  (rZahl1 == 1 && rZahl2 == 2 || rZahl2 == 1 && rZahl1 == 2){
                gesammt += 1000;
                maexchen++;
            }
            if (rZahl1 == rZahl2){
                gesammt += (rZahl1*100);
            } else
            if (rZahl1 > rZahl2){
                rZahl1 = rZahl1*10;
                gesammt += rZahl1 + rZahl2;
            } else
            if (rZahl1 < rZahl2){
                rZahl2 = rZahl2*10;
                gesammt += rZahl1 + rZahl2;
            }
        } while (gesammt <= 10000);

        maexchenpro = maexchen/wuerfe*100;

        System.out.println("Punkte Endstand: " + gesammt);
        System.out.println("Anzahl Würfe: " + wuerfe);
        System.out.println("Anzahl Mäxchen:" + maexchen);
        System.out.println("Mäxchen in Prozent:" + maexchenpro);
    }
}