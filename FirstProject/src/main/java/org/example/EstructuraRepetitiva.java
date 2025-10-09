package org.example;

public class EstructuraRepetitiva {

    void main() {

        //Volem imprimir de l'1 al 5 (o al 5000)
        IO.println("1");
        IO.println("2");
        IO.println("3");
        IO.println("4");
        IO.println("5");

        //Volem imprimir de l'1 al 5000
        int numero=1;

        //Creo un bucle WHILE
        while( numero<=5000 ) {                  //mentres la condició sigue true executem el codi del bloc { }
            IO.println(numero);
            numero++;
        }

        IO.println("Hem sortit del bucle!!");

        //Volem imprimir del 5000 a l'1
        numero=5000;

        //Creo un bucle WHILE
        while( numero>=1 ) {                  //mentres la condició sigue true executem el codi del bloc { }
            IO.println(numero);
            numero--;
        }

        IO.println("Hem sortit del bucle!!");

        //Volem imprimir del 5000 a l'1
        numero=5000;

        //Creo un bucle WHILE
        while( numero>=1 )                   //mentres la condició sigue true executem el codi del bloc { }
            IO.println(numero--);


        IO.println("Hem sortit del bucle!!");

        //Volem imprimir del 5000 a l'1
        numero=5001;

        //Creo un bucle WHILE
        while( numero>1 )                   //mentres la condició sigue true executem el codi del bloc { }
            IO.println(--numero);


        IO.println("Hem sortit del bucle!!");


        //Bucle que mostra un número introduit pel teclat i no para fins llegir el 0

    }



}
