package exercicis;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercici9Bis {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int n;
        int[] aparicions=new int['Z'-'A'+1];
        char[] lletres;                         //guardarem les lletres generades alaeatòriament
        int indLletres=0;
        Random r=new Random();

        //Demanem un valor enter positiu
        do{
            System.out.println("Introduix un valor major que 0:");
            n=ent.nextInt();
            if(n<1) System.out.println("El valor ha de ser major que 0!!");
            else break;
        }while(true);

        //Ara ja puc instanciar el vector que conté les n lletres
        lletres=new char[n];

        System.out.println("\nCaràcters aleatoris:\n");
        //Generem els caràcters aleatoris i anem actualizant els comptadors
        while(n-->0){
            char aleatori=(char)(r.nextInt('Z'-'A'+1)+'A');
            aparicions[aleatori-'A']++;
            System.out.print(aleatori);
            lletres[indLletres++]=aleatori;     //guardem el caracter al vector de lletres
        }

        System.out.println();
        //Mostrem les aparicions de cada caracter aparegut segons l'ordre d'aparició --> vector lletres
        for (int i = 0; i < lletres.length; i++) {
            if(aparicions[lletres[i]-'A']>0){
                System.out.format("El caràcter %c ha sortit %d vegad%s.%n", lletres[i], aparicions[lletres[i]-'A'],aparicions[lletres[i]-'A']==1?"a":"es");
                aparicions[lletres[i]-'A']*=-1;
            }
        }
    }
}
