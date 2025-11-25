package exercicis;

import java.util.Arrays;

public class Exercici17 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tractaParametres()));
        System.out.println(Arrays.toString(tractaParametres(null)));
        System.out.println(Arrays.toString(tractaParametres(new int[]{})));
        System.out.println(Arrays.toString(tractaParametres(new int[]{5,4,3,2,1})));
    }
    public static int[] tractaParametres(int... params){
        //Tractament de casos especials dels paràmetres de tipo referència (no primitius ni String)
        if(params==null || params.length==0) return null;

        //A partir sabem que rebem algun paràmetre --> params.length
        int suma, maxim, minim;
        suma=maxim=minim=params[0];         //inicialitzem les vars en el primer dels params variables

        //Recorrem la resta de parmas variables buscant el maxim i el minim i acumulant la suma
        for (int i = 1; i < params.length; i++) {
            suma+=params[i];
            if(params[i]>maxim) maxim=params[i];
            if(params[i]<minim) minim=params[i];
        }


        return new int[]{suma, params.length, maxim, minim};
    }
}
