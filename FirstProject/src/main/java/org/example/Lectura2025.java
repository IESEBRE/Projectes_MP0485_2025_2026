package org.example;


public class Lectura2025 {

    void main(){
        //Declaració de variables
        String text;

        text=IO.readln("Escriu un text acabat en INTRO:\n");    //afegim un salt de línia al final en \n

        IO.println("Has escrit el següent text:");
        IO.println(text);
    }
}
