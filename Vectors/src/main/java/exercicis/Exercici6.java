package exercicis;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercici6 {

    static void main() {
        Scanner ent=new Scanner(in);
        Random r=new Random();
        int[] comptadors;
        int numCares, numLlansaments;

        //Demanem a l'usuari el número de cares
        do{
            System.out.println("Introduix el numero de cares:");
            numCares=ent.nextInt();
            if(numCares<1) System.out.println("El número de cares ha de ser major que 0!!");
            else break;
        }while(true);

        //instanciem el vector
        comptadors=new int[numCares];

        //Demanem a l'usuari el número de llansaments
        do{
            System.out.println("Introduix el numero de llançaments:");
            numLlansaments=ent.nextInt();
            if(numLlansaments<0) System.out.println("El número de llançaments ha de ser major o igual que 0!!");
            else break;
        }while(true);

        //generem i comptem els números aleatoris
        for (int i = 0; i < numLlansaments; i++) {
            int a=r.nextInt(numCares-1+1)+1;
            comptadors[a-1]=comptadors[a-1]+1;
        }

        //Mostrem la quantitat d'aparicions de cada número aleatori
        int suma=0;
        for (int i = 0; i < comptadors.length; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n",i+1,comptadors[i]);
            suma+=comptadors[i];
        }

        System.out.println(suma);

    }

}
