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
        numero=1;               //inicialitzem la variable de control en qualsevol valor excepte el 0
        numero=Integer.parseInt(IO.readln("Introduix un número (0 per acabar):\n"));
        if(numero!=0) IO.println("Has introduit el "+numero);
        while(numero!=0){       //Usem while perquè volem iterar d'0 a n vegades
            numero=Integer.parseInt(IO.readln("Introduix un número (0 per acabar):\n"));
            if(numero!=0) IO.println("Has introduit el "+numero);
        }
        IO.println("Has sortit del bucle");




    }



}
