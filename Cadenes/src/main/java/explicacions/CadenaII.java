package explicacions;

public class CadenaII {

    static void main() {


        String cadena="Bon dia";

        System.out.println(cadena.endsWith("dia")?"Sí":"No");
        System.out.println(cadena.endsWith("Dia")?"Sí":"No");

        cadena="";
        System.out.println(cadena.isEmpty()?"Sí":"No");
        cadena=" ";
        System.out.println(cadena.isEmpty()?"Sí":"No");

        cadena="";
        System.out.println(cadena.isBlank()?"Sí":"No");
        cadena=" ";
        System.out.println(cadena.isBlank()?"Sí":"No");

        System.out.println("".isEmpty()?"Sí":"No");
        System.out.println("      ".isEmpty()?"Sí":"No");

        cadena="Hola";
        System.out.println(cadena.startsWith("dia")?"Sí":"No");
        System.out.println(cadena.startsWith("Ho")?"Sí":"No");

        cadena="Sóc un text llarg";
        System.out.format("El text \"%s\" té %d caràcters%n", cadena, cadena.length());

    }
}
