package org.example;

public class OperadorsI {

    void main() {

        //Declaració de variables
        int numero=0;
        int valor=89;

        //Incrementem en 1 la variable
        numero=numero+1;
        numero++;           //és equivalent a la de dalt, notació post fixa
        ++numero;           //també és equivalent a la primera, notació pre fixa

        IO.println(numero++);   //primer mostra valor i després incrementa
        IO.println(++numero);   //primer incrementa i després mostra valor

        //Decrementem un 1 la variable
        numero=numero-1;
        numero--;
        --numero;

        //Abreviacions
        numero=numero+25;
        numero+=25;         //abreviació de la de dalt
        numero=numero-34;
        numero-=34;         //abreviació de la de dalt
        numero=numero*valor;
        numero*=valor;      //abreviació de la de dalt

        //Operació seguint regles de precedència
        numero=numero*valor+34/63-numero;
        numero=(numero*valor)+34/63-numero;
        numero=(numero*valor)+(34/63)-numero;
        numero=((numero*valor)+(34/63))-numero;
        numero=(((numero*valor)+(34/63))-numero);

        //Operació canviant regles de precedència --> parentesis
        numero=numero*(valor+34)/63-numero;
        numero=(numero*(valor+34))/63-numero;
        numero=((numero*(valor+34))/63)-numero;
        numero=(((numero*(valor+34))/63)-numero);

    }


}
