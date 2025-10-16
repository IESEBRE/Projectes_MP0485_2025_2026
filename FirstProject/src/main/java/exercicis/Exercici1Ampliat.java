package exercicis;

public class Exercici1Ampliat {

    static void main() {
        //Declaració de variables
        int a,b;

        //Demanem la introducció dels 2 números
        IO.println("Introduix 2 números enters, sent el primer més menut que el segon:");
        a=Integer.parseInt(IO.readln());

        //Llegim el 2n i no parem fins que no sigue més gran que el primer
        b=Integer.parseInt(IO.readln());

        //Mirem si hem de tornar a demanr el segon número o no cal
        while(a>=b)
            b=Integer.parseInt(IO.readln("El segon ha de ser més gran que el primer:\n"));

        //Diem la única veritat possible
        IO.println(a + " és menor que "+ b);

    }
}
