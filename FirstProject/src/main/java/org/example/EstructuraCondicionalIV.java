package org.example;

public class EstructuraCondicionalIV {

    static void main() {
        int numero=2;
        String text;

        //IF ELSE simple
        if( numero%2 == 0 ) IO.println(numero+" és parell!!");
        else IO.println(numero+" és imparell!!");

        //Versió encara més simplificada utilitzant el OPERADOR CONDICIONAL TERNARI
        IO.println(numero+ (numero%2 == 0 ? " és parell!!" : " és imparell!!") );

        text = ( numero%2 == 0 ? " és parell!!" : " és imparell!!");
    }
}
