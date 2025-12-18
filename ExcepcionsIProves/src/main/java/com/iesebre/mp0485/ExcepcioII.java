package com.iesebre.mp0485;

import java.util.Scanner;

import static java.lang.System.in;

public class ExcepcioII {

    static void main() {

        String text=null;

        try {
            System.out.println("La longitud del text és " + text.length());
        }catch(NullPointerException ex){
            System.out.println("El text era null");
        }

        int[] array=new int[5];
        Scanner ent=new Scanner(in);
        try {
            System.out.println("El contingut de la casella és " + array[ent.nextInt()]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Casella inexistent!!");
        }


    }
}
