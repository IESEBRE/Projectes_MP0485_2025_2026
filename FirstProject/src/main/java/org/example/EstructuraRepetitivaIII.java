package org.example;

public class EstructuraRepetitivaIII {

    static void main() {

        //Programa que compta números parells fins que s'introduix un que
        //indica l'usuari

        //Declaració de variables
        int numero, fi, compt=0;

        //L'usuari introduix el número per finalitzar
        fi=Integer.parseInt(IO.readln("En quin número vols finalitzar?:\n"));

        //Demanem els números, comptem els parells i finalitzem quan s'introduisque
        //el numero fi
        do{
            numero=Integer.parseInt(IO.readln("Introduix un número ("+fi+" per finalitzar):\n"));
            if( numero%2 == 1 && numero!=fi) continue;        //tornem a l'inici del bucle
            compt++;        //Incremento el comptador de parells
        }while(numero!=fi);
        if(fi%2==1) compt--;        //Si fi era imparell haviem comptat un de més
    }
}
