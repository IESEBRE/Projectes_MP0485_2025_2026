package org.example;


public class LecturaNoString2025 {

    public static void main(String[] args) {

        //Declaració de variables
        int numCaramels, numNebots;

        //Llegim les dades utilitzant l'IO
        numCaramels = Integer.parseInt(IO.readln("Quants caramels tens:\n"));
        numNebots = Integer.parseInt(IO.readln("Quants nebots tens:\n"));

        //Double.parseDouble(), Byte.parseByte(), ...

        //Mostrem el resultat directament
        IO.println("Te queden " + (numCaramels % numNebots) + " caramels");

    }

}