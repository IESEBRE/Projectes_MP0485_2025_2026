package org.example;

public class EstructuraRepetitivaIV {

    static void main() {

        {
            int i = 0;
            while (i < 10) {
                IO.println(i);
                i++;
            }
        }

        //L'estructura repetitiva FOR
        for(int i=0; i < 10 ; i++){
            IO.println(i);
        }

        //Si volem usar la variable de control "i" fora del for l'hem de declarar abans
        int i;
        for(i=0; i < 10 ; i++){
            IO.println(i);
        }
        i++;

        //L'estructura repetitiva FOR en 2 variables de control
        for(int j=0, k=56; j < 10 && k%2==1 ; j++, k--){
            IO.println(j+k);
        }

    }

}
