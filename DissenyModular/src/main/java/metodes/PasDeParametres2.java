package metodes;

import java.util.Arrays;

public class PasDeParametres2 {

    public static void main(String[] args) {
        //Java SEMPRE fa pas de paràmetres per valor
        //Això només funciona així quan el paràmetre és de tipo primitiu, quan no passen coses diferents
        int[] num=new int[10];
        System.out.println("El valor de num és "+ Arrays.toString(num));
        repParametrePeroNoElModifiques2(num);
        System.out.println("El valor de num és "+ Arrays.toString(num));
    }

    public static void repParametre(int[] param){

        for (int i = 0; i < param.length; i++) {
            param[i]=param[i]+1;

        }

        System.out.println("El valor de param és "+Arrays.toString(param));

    }

    public static void repParametrePeroNoElModifiques(int[] param){
        //Primer fem una còpia de param
        int[] copia=new int[param.length];

        for (int i = 0; i < param.length; i++) {
            copia[i]=param[i]+1;
        }

        System.out.println("El valor de param és "+Arrays.toString(copia));

    }

    public static void repParametrePeroNoElModifiques2(int[] param){
        //Declaració de variables
        int[] copia=param;
        param=new int[param.length];

        for (int i = 0; i < param.length; i++) {
            param[i]=copia[i]+1;

        }

        System.out.println("El valor de param és "+Arrays.toString(param));
    }


    public static boolean dataCorrecta(int dia, int mes, int any){
        return true;

    }



}
