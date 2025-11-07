package arrays;

import java.util.Arrays;

public class EscriuArray3 {

    static void main() {
        //1. Llegim la línia inicial i en l'split ho guardem a un vector d'Strings
        String[] linia=IO.readln().split(" ");
        String[] liniaCurta=new String[linia.length-1];

        //2. Mostrem el vector de la forma demanada [ vector ]
        IO.print("[");
        for (int i = 0; i < liniaCurta.length; i++) {
            liniaCurta[i]=linia[i];
            IO.print(liniaCurta[i]);
            if(i!=liniaCurta.length-1) IO.print(", ");
        }
        IO.println("]");
        //IO.println(Arrays.toString(liniaCurta));

        //3. Llegim la posició i la mostrem
        IO.println(liniaCurta[Integer.parseInt(IO.readln())]);
    }
}
