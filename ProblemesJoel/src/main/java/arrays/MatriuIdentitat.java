package arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class MatriuIdentitat {

    static void main() {

        Scanner ent=new Scanner(in);
        int n;
        int[][] matriu;

        //1. Demanem la n a l'usuari
        n=ent.nextInt();

        //2. Instanciem la matriu
        matriu=new int[n][n];

        //3. Omplim i mostrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if(i==j) matriu[i][j]=1;
                System.out.format("%d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}
