package examen;

import java.util.Scanner;

import static java.lang.System.in;

public class Pr2_22_23 {

    static void main() {
        Scanner ent=new Scanner(in);
        int numcasos=ent.nextInt();

        while(numcasos-->0){
            //Tractament de cada cas
            int[] vector=new int[ent.nextInt()];

            for (int i = 0; i < vector.length; i++) {
                vector[i]=ent.nextInt();
            }
            int buscat=ent.nextInt();
            boolean apareix=false;

            for (int i = 0; i < vector.length; i++) {
                if(buscat==vector[i]) {
                    System.out.format("%d ", i + 1);
                    apareix = true;
                }
            }
            if(!apareix) System.out.println("NO APAREIX");
            else System.out.println();


        }

        //Tanco l'Scanner
        ent.close();


    }


}
