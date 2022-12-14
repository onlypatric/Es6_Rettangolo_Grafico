import java.util.Scanner;

/**
 * MainApp
 Leggere due numeri interi latominore e lato maggiore.

latominore è valido se 3<=latominore<=10

latomaggiore è valido se 3<=latomaggiore<=40

Quindi a seconda di una scelta di tipo int

con scelta==0       

stampare il rettangolo PIENO con gli '*'

Esempio

latominore = 3
latomaggiore = 10

**********
**********
**********

con scelta==1   

stampare il rettangolo VUOTO con gli '*'

Esempio

latominore = 3
latomaggiore = 10

**********
*        *
**********

@author Patric Pintescul
@version 1.0 14/12/2022 (dd/mm/yyyy)
 */
public class MainApp {

    public static int intInput(Scanner scanner){
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int latoMinore=0;
        int latoMaggiore=0;
        char selectionChar = 'O';
        String riempimentoRettangolo=" ";
        String latoRettangolo="*";

        // due input da tastiera allocati a variabili latoMinore,latoMaggiore
        do {
            try {
                System.out.print("Inserisci il lato minore (compreso tra 3 e 10)");
                latoMinore=intInput(sc);
            } catch (Exception e) {}
        } while (!(latoMinore>=3&&latoMinore<=10));
        do {
            try {
                System.out.print("Inserisci il lato maggiore (compreso tra 3 e 40)");
                latoMaggiore=intInput(sc);
            } catch (Exception e) {}
        } while (!(latoMaggiore>=3&&latoMaggiore<=40));
        
        //selezione per carattere, con conversione a set di caratteri e preso il primo elemento (tronca \n)
        do {
            selectionChar=sc.next().toCharArray()[0];
        } while (selectionChar!='P'&&selectionChar!='V'&&selectionChar!='I');
        // cambia riempimento rettangolo
        if(selectionChar=='P') riempimentoRettangolo="*";
        else if (selectionChar=='I') {riempimentoRettangolo="*";latoRettangolo=" ";}
        for (int i = 0; i < latoMinore; i++) {
            for (int j = 0; j < latoMaggiore; j++) {
                //stampa lati
                if(i==0||i==latoMinore-1||j==0||j==latoMaggiore-1)System.out.print(latoRettangolo);
                //se non siamo ai lati stampa il default (siamo nel riempimento)
                else System.out.print(riempimentoRettangolo);
            }
            //a capo
            System.out.println();
        }
    }
}