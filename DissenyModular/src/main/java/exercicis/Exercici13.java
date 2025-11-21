package exercicis;

import static exercicis.Exercici8.vectorDigits;

public class Exercici13 {

    public static void main(String[] args) {

        System.out.println(numVector(vectorDigits(1835))); //--> 1835

        System.out.println(numVector(new int[]{-1,8,3,5})); //--> 1835
        System.out.println(numVector(vectorDigits(-1835))); // --> -1835

        System.out.println(numVector(new int[]{})); //--> 0
        System.out.println(numVector(null)); //--> 0


    }

    public static int numVector(int[] numero){
        //tractem els casos especials dels paràmetres
        if(numero==null || numero.length==0) return 0;      //molt important PRIMER comprovar si és null!!
        //if(numero.length==0 || numero==null) return 0; --> en este ordre rebrem NullPointerException
        int solucio=0;
        int mult=1;
        boolean esNegatiu=numero[0]<0;
        if(esNegatiu) numero[0]*=-1;

        for (int i = numero.length-1; i >=0 ; i--) {
            solucio+=numero[i]*mult;
            mult*=10;
        }

        return esNegatiu?solucio*-1:solucio;
    }
}
