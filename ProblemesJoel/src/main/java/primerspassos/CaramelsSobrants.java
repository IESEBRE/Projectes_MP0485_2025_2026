package primerspassos;

import java.util.Scanner;

public class CaramelsSobrants {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int numCaramels, numNebots;

        //Llegim les dades utilitzant l'Scanner
        numCaramels=ent.nextInt();
        numNebots=ent.nextInt();

        //Mostrem el resultat directament
        System.out.println(numCaramels%numNebots);

        //Tanco l'Scanner
        ent.close();
    }

}
