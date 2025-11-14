package exercicis;

import java.util.Scanner;

import static java.lang.System.in;

public class Exercici18 {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int n;
        int[][] magica;
        int valor=1;            //valor que anirem posant sa les caselles de la matriu, increment-lo en 1
        int i=0, j;
        //Demanem un valor enter positiu i imparell
        do{
            System.out.println("Introduix un valor imparell major que 0:");
            n=ent.nextInt();
            if(n<1 || n%2==0) System.out.println("El valor ha de ser imparell i major que 0!!");
            else break;
        }while(true);

        //Ara ja puc instanciar la matriu, i calcular el valor inicial de la j
        magica=new int[n][n];
        j= magica.length/2;

        //Generem la matriu màgica
        while(valor<=magica.length*magica.length){
            //Omplim una casella de la matriu
            magica[i][j]=valor;

            //Preparem la i, j per a que estiguen a la posició correcta
            int iAnt=i;
            int jAnt=j;
            i--;        //anem una fila cap amunt
            j--;        //anem una columna cap a l'esquerra
            if(i<0) i=magica.length-1;
            if(j<0) j=magica.length-1;

            //Mirem si la nova posició està ja ocupada i modifiquem els indexos adequadament
            if(magica[i][j]!=0){
                i=iAnt+1;
                j=jAnt;
            }

            //Incremento el valor ha introduir en una unitat
            valor++;
        }

        System.out.format("Quadrat màgic %d x %d5:%n%n", magica.length, magica.length);
        //Mostrem la matriu màgica
        for (i = 0; i < magica.length; i++) {
            for (j = 0; j < magica[i].length; j++) {
                System.out.format(n<11?"%3d":"%4d", magica[i][j]);
            }
            System.out.println();
        }

    }
}
