package vectors;

import java.util.Random;

public class Aleatori2 {

    static void main() {
        //Declaració de variables
        Random r=new Random(1L);

        //Com generar nºs aleatoris entre un rang de valors x i y
        //r.nextInt(y-x+1)+x

        //Com generar nºs aleatoris entre un rang de valors: 52 i 64
        for (int i = 0; i < 5; i++) {
            IO.println(r.nextInt(64-52+1)+52);  //generarà números entre 0 i 10
        }

        IO.println();

        //Com generar caracters aleatoris entre un rang de valors: 'D' i 'S'
        for (int i = 0; i < 5; i++) {
            IO.println((char)(r.nextInt('S'-'D'+1)+'D'));  //generarà números entre 0 i 10
        }

    }

}
