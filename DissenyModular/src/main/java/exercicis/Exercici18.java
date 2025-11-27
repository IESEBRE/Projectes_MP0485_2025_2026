package exercicis;

import java.util.Arrays;

public class Exercici18 {

    public static void main(String[] args) {

        Exercici18.ompleVectorFloats(null);     //accés a mètode static

        Exercici18 obj=new Exercici18();
        obj.ompleVectorFloatsCurta(null);       //accés a mètode NO static
        System.out.println(Arrays.toString(obj.ompleVectorFloats(new float[]{12.3f,45.7f,10e34f})));

    }

    public float[] ompleVectorFloatsCurta(float... param) {
        if (param == null || param.length == 0) return null;
        return param;
    }

    public static float[] ompleVectorFloats(float... param) {
        if (param == null || param.length == 0) return null;

        float[] solucio = new float[param.length];
        for (int i = 0; i < solucio.length; i++) {
            solucio[i] = param[i];
        }
        return solucio;

    }
}