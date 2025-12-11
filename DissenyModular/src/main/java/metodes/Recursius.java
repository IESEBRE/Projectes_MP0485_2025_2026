package metodes;

public class Recursius {

    public static void recursiu(int numVoltes){
        if(numVoltes<=0) System.out.println("Paro");
        else {
            System.out.println("El paràmetre val "+numVoltes);
            recursiu(numVoltes-1);
        }
    }

    /**
     * Calcula n!
     * @param n valor del qual volem calcular el factorial
     * @return el factorial de n
     */
    public static int factorial(int n){
        int producte=1;
        for (int i = 1; i <=n ; i++) {
            producte*=i;
        }
        return producte;
    }

    public static int factorialRecursiu(int n) {
        if (n<0) return 0;
        if(n==0) return 1;
        return n*factorialRecursiu(n-1);
    }

    public static int mcd(int a, int b){
        if(a==b) return a;
        if(a<b) return mcd(a, b-a);
        return mcd(a-b,b);
    }

    public static void main(String[] args) {
        //while(true);
        //System.out.println(factorialRecursiu(10022220));
        recursiu(5);
        System.out.println(reverse("abcd"));
    }

    /**
     * Retorna la cadena en les lletres del paràmetre a la inversa
     * @param normal text que volem girar
     * @return el text girat
     */
    public static String reverse(String normal){
        String resultat="";
        //bucle que concatene les lletres en l'ordre desitjat
        for (int i = 0; i < normal.length(); i++) {
            resultat= normal.charAt(i)+resultat;
        }
        return resultat;
    }


}
