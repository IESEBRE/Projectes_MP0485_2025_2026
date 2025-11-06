package arrays;

import java.util.Scanner;

public class EscriuArray4 {

    static void main() {
        Scanner ent=new Scanner(System.in);
        int[] vector=new int[ent.nextInt()];
        int inc;

        //Llegim els valors de l'array i l'anem omplint
        for (int i = 0; i < vector.length; i++) {
            vector[i]= ent.nextInt();
        }

        //Llegim l'increment a aplicar als elements del vector
        inc=ent.nextInt();

        //Mostrem els valors de l'array incrementats adequadament
        for (int i = 0; i < vector.length; i++) {
            IO.print(String.format("%d ", vector[i]+inc));
        }

        IO.println();
    }
}
