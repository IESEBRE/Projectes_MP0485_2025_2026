package org.example;

public class EstructuraCondicionalII {

    static void main() {
        int edat=16;

        //IF simple
        if( edat >= 18 ) IO.println("Ets major d'edat!!");

        if( edat >= 18 ) {
            IO.println("Ets major d'edat");
            IO.println("Enhorabona");
        }

        if( edat >= 18 )            //; COMPTE EN FICAR ; AQUÍ
        {
            IO.println("Ets major d'edat");
            IO.println("Enhorabona");
        }

        //IF ELSE
        if( edat >= 18 ) IO.println("Ets major d'edat!!");
        else IO.println("No ets major d'edat!!");

        if( edat >= 18 ) {
            IO.println("Ets major d'edat");
            IO.println("Enhorabona");
        }else{
            IO.println("No ets major d'edat");
            IO.println("Ja t'arribarà");
        }

        if( edat >= 18 ) {
            IO.println("Ets major d'edat");
            IO.println("Enhorabona");
        } else if ( edat <= 12) {
            IO.println("Ets un xiquet!!");
        }

        if( edat >= 18 ) {
            IO.println("Ets major d'edat");
            IO.println("Enhorabona");
        } else if ( edat <= 12) {
            IO.println("Ets un xiquet!!");
        } else IO.println("Ets un teenager!!");


    }
}
