package arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class MaximMatriu {

    static void main() {
        //Declaracio de variables
        Scanner ent=new Scanner(in);
        int numCasos;
        int[][] matriu;
        int iMax, jMax,         //guardem les coordenades de la casella que conté el màxim
                maxim;          //valor del maxim trobat
        //1. Llegim el número de casos
        numCasos=ent.nextInt();

        while(numCasos-->0){
            //Tractament de cada cas
            matriu=new int[ent.nextInt()][ent.nextInt()];   //instanciem la matriu
            //Llegim a banda el primer valor de la matriu i l'assignem al màxim
            matriu[0][0]=ent.nextInt();
            maxim=matriu[0][0];
            //maxim=Integer.MIN_VALUE;
            iMax= jMax = 0;

            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    //Tractem totes les caselles excepte la 0,0
                    if(i==0 && j==0) continue;
                    matriu[i][j]=ent.nextInt();
                    if(matriu[i][j]>=maxim){
                        maxim=matriu[i][j];
                        iMax=i;
                        jMax=j;
                    }
                }
            }

            //Mostro el resultat demanat
            System.out.format("%d %d%n", iMax+1, jMax+1);
        }

        //tanco l'scanner
        ent.close();
    }
}
