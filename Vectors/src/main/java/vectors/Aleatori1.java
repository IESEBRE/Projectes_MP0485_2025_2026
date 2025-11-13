package vectors;

import java.util.Random;

public class Aleatori1 {

    static void main() {
        //Declaració de variables
        Random r=new Random();
        int[] vector=new int[11];

        for (int i = 0; i < 20; i++) {
            IO.println(r.nextInt(11));  //generarà números entre 0 i 10
        }


    }
}
