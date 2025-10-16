package exercicis;

public class Exercici1 {

    static void main() {
        //Declaració de variables
        int a,b;

        //Demanem la introducció dels 2 números
        IO.println("Introduix 2 números enters:");
        a=Integer.parseInt(IO.readln());
        b=Integer.parseInt(IO.readln());

        //Fem les comparacions demanades
        if( a==b ) IO.println("Els 2 números valen el mateix");
        else if ( a<b ) IO.println(a + " és menor que "+ b);
        else IO.println(a + " és major que "+ b);

    }
}
