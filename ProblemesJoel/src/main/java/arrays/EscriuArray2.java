package arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class EscriuArray2 {

    static void main() {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        String[] vector;


        //1. Llegim dimensió de l'array i l'instanciem
        vector=new String[ent.skip("[\r\n]*").nextInt()];


        //2. Omplim l'array i el mostrem
        for (int i = 0; i < vector.length; i++) {
            IO.println(vector[i]=ent.skip("[\r\n]*").nextLine());
        }

        //3. Llegir la posició a mostrar i la mostrem
        IO.println(vector[ent.skip("[\r\n]*").nextInt()]);

        //tanco l'scanner
        ent.close();

    }
}
