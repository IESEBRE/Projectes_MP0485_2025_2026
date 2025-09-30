package org.example;

public class EstructuraCondicionalI {

    void main(){

        //Declaració de variables
        boolean esMati=true;
        String resposta;


        //Mostrem el text dient que estem al matí
        IO.println("Estem al matí");

        //Preguntem-li a l'usuari si estem o no al matí
        resposta = IO.readln("Estem al matí? (S/N):");

        //Modifiquem el valor d'esMati depenent de la resposta de l'usuari
        esMati = (resposta == "S");             //incorrecte perquè els objectes no es comparen en ==
        esMati = resposta.equals("S");
        esMati = resposta.equalsIgnoreCase("S");

        //Ho poso dins una estructura condicional IF
        if( esMati ) IO.println("Estem al matí");

        //El mateix IF simplificat
        if( IO.readln("Estem al matí? (S/N):").equalsIgnoreCase("S") ) IO.println("Estem al matí");


    }
}
