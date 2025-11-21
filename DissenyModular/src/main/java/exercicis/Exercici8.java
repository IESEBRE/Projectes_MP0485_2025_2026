package exercicis;

import java.util.Arrays;

public class Exercici8 {

    public static int[] vectorDigits(int numero){
        //Declaració de variables
        //Primer que res miro si el numero és negatiu
        boolean esNegatiu=numero<0;
        if(esNegatiu) numero*=-1;   //si numero és negatiu el passem a positiu

        int dim=Integer.toString(numero).length();
        int[] solucio=new int[dim];
        int index=dim-1;

        //Omplim el vector en els dígits de numero
        while(numero>0){
            solucio[index--]=numero%10;
            numero/=10;                     // numero=numero/10;
        }

        //Mirem si numero era negatiu per canviar el signe del vector
        if(esNegatiu) solucio[0]*=-1;
        return solucio;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vectorDigitsV2(-1835)));
    }

    public static int[] vectorDigitsV2(int numero) {
        //Primer que res miro si el numero és negatiu
        boolean esNegatiu=numero<0;
        if(esNegatiu) numero*=-1;   //si numero és negatiu el passem a positiu

        //Paso el numero a String
        String cadena=Integer.toString(numero);
        int[] solucio=new int[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            char c=cadena.charAt(i);
            solucio[i] = Integer.parseInt(Character.toString(c));
        }

        //Mirem si numero era negatiu per canviar el signe del vector
        if(esNegatiu) solucio[0]*=-1;
        return solucio;

    }
}


