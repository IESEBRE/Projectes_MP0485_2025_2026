package exercicis;

import java.util.Scanner;

import static java.lang.System.in;

public class Exercici14Numeric {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int n;
        int contingut=0;
        char[][] matriu;

        //1. Demanem la n a l'usuari
        do{
            IO.println("Introduix un enter major que 0:");
            n=ent.nextInt();
            if(n<1) IO.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        //2. Instanciem la matriu
        matriu=new char[n][n];

        //3. Omplim i mostrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=(char)(  contingut++%('z'-'A'+1) + 'A');
                System.out.format("%5c", matriu[i][j]);
            }
            System.out.println();
        }
    }
}
