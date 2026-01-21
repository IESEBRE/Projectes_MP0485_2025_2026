package codifont;

public class Metodes{

    //Mètode d'exemple --> d'este trobareu un test fet al fitxer dels tests, no n'heu de fer cap vatros
    public static int metodeExemple(int num){
        return 0;
    }

    //Mètodes a testejar
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No es pot dividir per zero");
        }
        return a / b;
    }

    public static boolean esParell(int n) {
        return n % 2 == 0;
    }

    public static int max(int[] dades) {
        if (dades == null) {
            throw new IllegalArgumentException("L'array no pot ser null");
        }
        if (dades.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit");
        }
        int max = dades[0];
        for (int i = 1; i < dades.length; i++) {
            if (dades[i] > max) {
                max = dades[i];
            }
        }
        return max;
    }

    public static String primerCaracter(String text) {
        if (text == null) {
            return null;
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("El text no pot ser buit");
        }
        return text.substring(0, 1);
    }

    public static int[] invertirArray(int[] dades) {
        if (dades == null || dades.length==0) {
            return dades;
        }
        int[] resultat = new int[dades.length];
        for (int i = 0; i < dades.length; i++) {
            resultat[i] = dades[dades.length - 1 - i];
        }
        return resultat;
    }

    public static double mitjana(int[] dades) {
        if (dades == null) {
            throw new IllegalArgumentException("L'array no pot ser null");
        }
        if (dades.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit");
        }
        int suma = 0;
        //Sentència for-each --> recorre tots els elements de l'array i a cada iteració n conté a l'element a tractar (és com un for normal però sense índex)
        for (int n : dades) {
            suma += n;
        }
        return (double) suma / dades.length;
    }

    public static int comptarPositius(int[] dades) {
        if (dades == null) {
            return 0;
        }
        int comptador = 0;
        for (int n : dades) {
            if (n > 0) {
                comptador++;
            }
        }
        return comptador;
    }

    public static int buscar(int[] dades, int valor) {
        if (dades == null) {
            throw new IllegalArgumentException("L'array no pot ser null");
        }
        for (int i = 0; i < dades.length; i++) {
            if (dades[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int[] normalitzar(int[] dades) {
        if (dades == null) {
            return null;
        }
        if (dades.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit");
        }
        int min = dades[0];
        for (int n : dades) {
            if (n < min) {
                min = n;
            }
        }
        int[] resultat = new int[dades.length];
        for (int i = 0; i < dades.length; i++) {
            resultat[i] = dades[i] - min;
        }
        return resultat;
    }

    public static boolean totsPositius(int[] dades) {
        if (dades == null) {
            throw new IllegalArgumentException("L'array no pot ser null");
        }
        for (int n : dades) {
            if (n <= 0) {
                return false;
            }
        }
        return true;
    }


}