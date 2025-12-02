package com.iesebre.mp0485;

import java.util.Scanner;

import static com.iesebre.mp0485.Metodes.retornaCaracter;
import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Declaració de variables
        Scanner ent=new Scanner(in);
        int num;

        //Li diem a l'usauri que trie el número de caracters a msotrar
        System.out.println("Quants caràcters vols mostrar (>=1):");
        do{
            num=ent.nextInt();
            if(num<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        for (int i = 0; i < num; i++) {
            System.out.print(retornaCaracter('z', 'a'));
        }
        System.out.println();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}
