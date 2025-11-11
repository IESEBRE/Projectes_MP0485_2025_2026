package exercicis;

import java.util.Scanner;

import static java.lang.System.in;

public class Exercici12 {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int n;
        int[][] matriu;

        //1. Demanem la n a l'usuari
        do{
            IO.println("Introduix un enter major que 0:");
            n=ent.nextInt();
            if(n<1) IO.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        //2. Instanciem la matriu
        matriu=new int[n][n];

        //3. Omplim i mostrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if(i==j || i+j==matriu.length-1) matriu[i][j]=1;
                System.out.format("%5d", matriu[i][j]);
            }
            System.out.println();
        }
    }
}
