package com.iesebre.mp0485;

import java.util.Random;

public class Metodes {



    public static char retornaCaracter(){

        return (char)(new Random().nextInt('}'-' '+1)+' ');

    }

    /**
     * Retorna un caràcter aleatòriament entre lletra1 i lletra2.
     * No importa l'ordre en que passem els caràcters lletra1 i lletra2.
     * @param lletra1 límit dels caràcters a generar
     * @param lletra2 l'altre límit dels caràcters a generar
     * @return un caràcter aleatori entre lletra1 i lletra2
     */
    public static char retornaCaracter(char lletra1, char lletra2){
        //Si lletra1 és menor o igual que lletra2 no cal fer res als paràmetres
        //sinó haurem d'intercanviar els paràmetres
        if(lletra1>lletra2){
            char temp;
            temp=lletra1;
            lletra1=lletra2;
            lletra2=temp;
        }

        return (char)(new Random().nextInt(lletra2-lletra1+1)+lletra1);
    }









}
