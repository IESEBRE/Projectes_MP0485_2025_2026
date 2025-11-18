package vectors;

import java.util.Scanner;

import static java.lang.System.in;

public class BuscarMinim {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        String[] paraules=new String[5];
        String min;
        int iMin;

        for (int i = 0; i < paraules.length; i++) {
            paraules[i]=ent.nextLine();
        }
        iMin=0;                 //faig la suposició de que la paraula menor està a la posició 0
        min=paraules[iMin];     //el minim inicial pot ser qualsevol casella del vector

        //Anem a buscar la paraula més menuda --> la 0 no cal mirar-la per què hem suposat que conté el mínim
        for (int i = 1; i < paraules.length; i++) {
               if(paraules[i].compareTo(min)<=0){
                   min=paraules[i];
                   iMin=i;
               }
        }

        System.out.format("La paraula més menuda és %s i es troba a la posició %d.%n", min, iMin);

        ent.close();
    }
}
