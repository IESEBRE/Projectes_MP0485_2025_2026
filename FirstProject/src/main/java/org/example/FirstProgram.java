package org.example;

public class FirstProgram {

    public static void main(String[] args) {

        //Declaració de variables
        int edatPersona=20;  //Noms incorrectes: EdatPersona, edatpersona, EDATPERSONA

        edatPersona=56;

        System.out.println("Hello world!!");
        System.out.println("Segona línia!!"+"20");
        System.out.println(edatPersona);

        edatPersona= edatPersona + 10;  // + sumar
        edatPersona= edatPersona - 10;  // - restar
        edatPersona= edatPersona * 10;  // * multiplicar
        edatPersona= edatPersona / 10;  // / divisió entera
        edatPersona= edatPersona % 10;  // % resto, mòdul de la divisió entera


        System.out.println("Esta persona té una edat de " + edatPersona);
    }
}
