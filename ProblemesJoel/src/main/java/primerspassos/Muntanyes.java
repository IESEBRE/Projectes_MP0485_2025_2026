package primerspassos;

import java.util.Scanner;

import static java.lang.System.in;

public class Muntanyes {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(in);
        int num1, num2, num3, num4, num5;

        //Llegim els 5 números
        num1=ent.nextInt();
        num2=ent.nextInt();
        num3=ent.nextInt();
        num4=ent.nextInt();
        num5=ent.nextInt();

        //Comprovem si són muntanyes o no --> if else
        if( (num1<num2 && num2>num3 && num3<num4 && num4>num5) ||   // busquem /\/\
                (num1>num2 && num2<num3 && num3>num4 && num4<num5)  // busquem \/\/
        ){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        };

        //Tanquem l'scanner
        ent.close();
    }

}
