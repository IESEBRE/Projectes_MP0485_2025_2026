package org.example;

public class NomsDevariables {

    void main() {

        //Noms de variables
        int _123anys;   //no poden començar en número
        boolean alturaPersona;
        char    canya;
        //int package;
        int bolea;
        float NUMERO;   //funciona però no seguix la convenció ja que utilitza la notació per definir constants
        final int NUMERO2=25;  //nom de constant correcte

        NUMERO=3.0F;    //sembla una constant però no ho és ja que li puc canviar el valor
        //NUMERO2=34;     //és una constant ja que no li puc canviar el valor



    }

    void altreMetode(){
        {
            int i=0;
            IO.println(i);
        }
        //IO.println(i);
        {
            int i=10;
            IO.println(i);
        }
    }


}
