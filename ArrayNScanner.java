
package arraynscanner;
import java.util.Scanner;

public class ArrayNScanner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib an, wie viele Namen du speichern möchtest:");
        int anzahl = eingabe.nextInt();
        int richtigeantworten = 0;
        
        String[]namensliste = new String [anzahl];
    
        for (int a=0; a<anzahl; a++){
        System.out.println("Bitte gib " + (a+1) + ". Namen ein");
            String name = eingabe.next();
            namensliste[a]=name;
        }
        
        

        
       for (int b=0; b<anzahl; b++) {
            System.out.println("Wie lautet der " + (b+1) + ". Name?");
            String antwort = eingabe.next();
            if (antwort.contentEquals(namensliste[b])){
            System.out.println("Die Antwort ist richtig!");
            richtigeantworten +=1;
            }
            else {
                System.out.println("Die Antwort ist falsch");
            }
        }
        
        if(richtigeantworten==anzahl) {
            System.out.println("Sie haben gewonnen!");
        }
        else {
            System.out.println("Sie haben verloren!");
        }
       
    }
}
