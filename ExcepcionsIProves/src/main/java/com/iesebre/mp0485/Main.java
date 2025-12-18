package com.iesebre.mp0485;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //Variables
        Scanner ent=new Scanner(in);
        int num=0;
        ent.close();

        do{
            System.out.println("Escriu un enter entre 1 i 5:");

            //La següent instrucció pot provocar excepcions
            try {
                num = ent.nextInt();
            }catch(InputMismatchException ex){
                System.out.println(ex.getMessage());
                num=0;
                ent.next();
            }catch(IllegalStateException ex){
                System.out.println(ex.getMessage());
                ent=new Scanner(in);
            }catch(NoSuchElementException ex){
                System.out.println("Critical error!!");
                System.out.println("System is going down!!");
                num=3;
            }
            if(num<1 || num>5) System.out.println("Ha de ser numèric i estar entre 1 i 5!!");
            else break;
        }while(true);

        //Tanquem l'escaner
        ent.close();

    }
}
