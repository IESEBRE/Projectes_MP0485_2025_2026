package primerspassos;

import java.util.Scanner;

import static java.lang.System.in;

public class YoSiPudieraVotabaALaFalange {

    public static void main(String[] args) {
        //Sumar la diferencia entre els 3 partits i mirar si la suma dona negatiu, 0, 1 o major que 1

        //Declaració de variables
        int a1, b1, c1, a2, b2, c2;     //guardem els vots
        int suma;                       //guardarem la diferènci entree els vots
        Scanner ent=new Scanner(in);

        //Llegim els 6 vots
        a1=ent.nextInt();
        b1=ent.nextInt();
        c1=ent.nextInt();
        a2=ent.nextInt();
        b2=ent.nextInt();
        c2=ent.nextInt();
        /*
        //Comparem els vots
        if(a1+1==a2 && b1==b2 && c1==c2) IO.println("A");
        else if(a1==a2 && b1+1==b2 && c1==c2) IO.println("B");
        else if(a1==a2 && b1==b2 && c1+1==c2) IO.println("C");
        else if(a1==a2 && b1==b2 && c1==c2) IO.println("BLANC");
        else IO.println("NUL");

        */
        //Sumen les diferències de vots dels 3 partits
        suma=Math.abs(a2-a1)+Math.abs(b2-b1)+Math.abs(c2-c1);

        switch(suma){
            case 0:
                IO.println("BLANC");
                break;
            case 1:
                //Comparem els vots del primer partit
                if(a1+1==a2) IO.println("A");
                else if(b1+1==b2) IO.println("B");
                else IO.println("C");
                break;
            default:
                IO.println("NUL");
        }

        ent.close();


    }
}
