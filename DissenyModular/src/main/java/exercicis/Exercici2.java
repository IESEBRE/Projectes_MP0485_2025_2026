package exercicis;

import java.util.Random;
import java.util.Scanner;

import static exercicis.Exercici1.retornaCaracter;
import static java.lang.System.in;

public class Exercici2 {

    public static void mostraVarisCaracters(int numCaracters){

        while(numCaracters-- > 0) {
            char aleatori=retornaCaracter();
            System.out.print(aleatori);
        }

    }

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int num;

        System.out.println("Digues quants caracters vols vore (>=1):");
        do{
            num=ent.nextInt();
            if(num>=1) break;
            else System.out.println("Ha de ser major o igual que 1!!");
        }while(true);

        mostraVarisCaracters(num);

    }


}
