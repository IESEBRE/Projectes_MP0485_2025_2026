package org.example;


import java.util.Scanner;

public class Lectura2024 {

    void main(){
        //Declaració de variables
        Scanner entrada=new Scanner(System.in);
        String text;

        IO.println("Escriu un text acabat en INTRO:");
        text=entrada.nextLine();

        IO.println("Has escrit el següent text:");
        IO.println(text);
    }
}
