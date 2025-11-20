package exercicis;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercici1 {

    public static void main(String[] args) {
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

    }

    public static char retornaCaracter(){

        return (char)(new Random().nextInt('}'-' '+1)+' ');

    }

    public static char retornaCaracter(char lletra1, char lletra2){
        //Si lletra1 és menor o igual que lletra2 no cal fer res als paràmetres
        //sinó haurem d'intercanviar els paràmetres
        if(lletra1>lletra2){
            char temp;
            temp=lletra1;
            lletra1=lletra2;
            lletra2=temp;
        }

        return (char)(new Random().nextInt(lletra2-lletra1+1)+lletra1);
    }

}
