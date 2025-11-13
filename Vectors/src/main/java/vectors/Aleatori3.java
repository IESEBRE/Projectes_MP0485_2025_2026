package vectors;

import java.util.Random;

public class Aleatori3 {

    static void main() {

        //Programa que genera 1.000.000 de números aleatoris entre 250.007 i 250.015
        //i compta quantes vegades ha aparegut cada uns dels números aleatoris
        Random r=new Random();
        int[] comptadors=new int[250015-250007+1];

        //generem i comptem els números aleatoris
        for (int i = 0; i < 1000000; i++) {
            int a=r.nextInt(250015-250007+1)+250007;
            comptadors[a-250007]=comptadors[a-250007]+1;
        }

        //Mostrem la quantitat d'aparicions de cada número aleatori
        int suma=0;
        for (int i = 0; i < comptadors.length; i++) {
            System.out.format("El número %d ha sortit %d vegades.%n",i+250007,comptadors[i]);
            suma+=comptadors[i];
        }

        System.out.println(suma);

    }
}
