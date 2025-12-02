package examen;

import java.util.Scanner;

import static java.lang.System.in;

public class Pr1_22_23 {

    static void main() {
        //Declaració de variables
        Scanner sc=new Scanner(in);
        int act, ant, comptTotal=1, comptIncr=0;

        //Lligo el primer valor abans de crear un bucle
        act=sc.nextInt();

        //Bucle per llegir la resta dels valors
        while(act!=0){
            //Primer que res copio el valor últim introduit
            ant=act;
            //Lligo un nou valor i incrementem el comptador total
            act=sc.nextInt();
            comptTotal++;

            //Mirem si hi ha hagut un increment i en cas afirmatiu el comptabilitzem
            if(act>ant) comptIncr++;
        }

        //Mostrem el resultat
        System.out.format("%d %d%n", comptTotal, comptIncr);

        //Tanquem l'scanner
        sc.close();
    }

}
