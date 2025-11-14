package exercicis;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercici9 {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int n;
        int[] aparicions=new int['Z'-'A'+1];
        Random r=new Random();

        //Demanem un valor enter positiu
        do{
            System.out.println("Introduix un valor major que 0:");
            n=ent.nextInt();
            if(n<1) System.out.println("El valor ha de ser major que 0!!");
            else break;
        }while(true);

        System.out.println("\nCaràcters aleatoris:\n");
        //Generem els caràcters aleatoris i anem actualizant els comptadors
        while(n-->0){
            char aleatori=(char)(r.nextInt('Z'-'A'+1)+'A');
            aparicions[aleatori-'A']++;
            System.out.print(aleatori);
        }

        System.out.println();
        //Mostrem les aparicions de cada caracter aparegut
        for (int i = 0; i < aparicions.length; i++) {
            if(aparicions[i]!=0) System.out.format("El caràcter %c ha sortit %d vegad%s.%n", i+'A', aparicions[i],aparicions[i]==1?"a":"es");
        }
    }
}
