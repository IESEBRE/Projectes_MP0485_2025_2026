package arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class EscriuArray1 {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int[] vector;
        int dim, pos;

        //1. Llegim dimensió de l'array i l'instanciem
        dim=ent.nextInt();
        vector=new int[dim];

        //2. Omplim l'array i el mostrem
        for (int i = 0; i < vector.length; i++) {
            IO.print(String.format("%d ",vector[i]=ent.nextInt()));
        }
        IO.println();

        //3. Llegir la posició a mostrar i la mostrem
        pos=ent.nextInt();
        IO.println(vector[pos]);

    }
}
