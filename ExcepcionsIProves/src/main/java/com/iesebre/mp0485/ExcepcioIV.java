package com.iesebre.mp0485;

import java.util.Scanner;

import static java.lang.System.in;

public class ExcepcioIV {


    static void main() {
        Scanner ent=new Scanner(in);
        try{
            switch(ent.nextInt()){
                case 0:
                    //Genero una excepció inventada
                    throw new NullPointerException();
                default:
                    System.out.println("continuem cap al finally");
            }
        }catch(Exception ex){
            System.out.println("Estic tractant l'excepció");
        }finally{
            System.out.println("Sortim del tractament d'excepcions");
        }


    }
}
