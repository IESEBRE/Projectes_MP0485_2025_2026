package primerspassos;

import java.util.Scanner;

import static java.lang.System.in;

public class Arbolitos {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(in);
        double c1, c2, k1, k2, k3;
        int comptador = 0;              //Inicialment no tenim cap Arbolito, per tant posem el comptador a 0

        //Llegim les dades
        c1=ent.nextDouble();
        c2=ent.nextDouble();
        k1=ent.nextDouble();
        k2=ent.nextDouble();
        k3=ent.nextDouble();

        //Mirem si l'altura de cada vegetal està dins dels límits dels arbolitos
        //i en cas afirmatiu incrementem el comptador
        if(k1>c1 && k1<c2) comptador++;
        if(k2>c1 && k2<c2) comptador++;
        if(k3>c1 && k3<c2) comptador++;

        //Mostrem el resultat, que tenim al comptador
        System.out.println(comptador);

        //Tanco l'scanner
        ent.close();
    }
}
