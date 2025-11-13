package exercicis;

import java.util.Scanner;

import static java.lang.System.in;

public class Exercici1 {

    static void main() {
        Scanner ent=new Scanner(in);
        int num, factor=2;
        int[] descomposicio;
        int index=0;

        //Demanem a l'usuari el valor a descompondre
        do{
            System.out.println("Introduix un valor major que 0:");
            num=ent.nextInt();
            if(num<1) System.out.println("El valor ha de ser major que 0!!");
            else break;
        }while(true);

        //Instancio el vector una vegada se quin num s'ha introduït
        descomposicio=new int[Math.round((float)(Math.log(num) / Math.log(2)))];

        while(num!=1){
            if(num%factor==0){
                descomposicio[index++]=factor;
                num=num/factor;
            }else factor++;
        }

        for (int i = index-1; i >=0 ; i--) {
            System.out.format("%d * ", descomposicio[i]);
        }
        System.out.println(1);

        ent.close();

    }
}
