package arrays;

import java.util.Scanner;

public class EscriuArray4vIO {

    static void main() {
        int[] vector=new int[Integer.parseInt(IO.readln())];
        int inc;

        //Obtenim un arry d'Strings en els números a tractar
        String[] numsSeparats=IO.readln().split(" ");


        //Llegim els valors de l'array i l'anem omplint
        for (int i = 0; i < vector.length; i++) {
            vector[i]= Integer.parseInt(numsSeparats[i]);
        }

        //Llegim l'increment a aplicar als elements del vector
        inc=Integer.parseInt(IO.readln());

        //Mostrem els valors de l'array incrementats adequadament
        for (int i = 0; i < vector.length; i++) {
            IO.print(String.format("%d ", vector[i]+inc));
        }

        IO.println();
    }
}
