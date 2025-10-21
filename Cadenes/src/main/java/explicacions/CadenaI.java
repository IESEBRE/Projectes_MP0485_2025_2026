package explicacions;

import java.util.Scanner;

public class CadenaI {

    static void main() {

        Scanner ent=new Scanner(System.in);

        String cadena="Sóc una cadena de caràcters";
        String cadena2=new String("Sóc una altra cadena");

        System.out.println("Una altra cadena");
        System.out.println("Una altra cadena");

        String cadena3="Hola";
        String cadena4="Hola";

        //El següent if_else mira si cadena3 i cadena4 apunten al mateix objecte
        if(cadena3==cadena4) System.out.println("Són iguals");
        else System.out.println("No són iguals");

        //El següent if_else mira si cadena3 i cadena4 tenen el mateix text
        if(cadena3.equals(cadena4)) System.out.println("Són iguals");
        else System.out.println("No són iguals");

    }
}
