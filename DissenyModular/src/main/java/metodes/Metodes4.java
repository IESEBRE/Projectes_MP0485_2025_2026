package metodes;

public class Metodes4 {

    public static void main(String[] args) {
        //Declaració de variables
        int a=3, b=6;
        variablesMetode(a);
        variablesMetode(b);
        variablesMetode(25);

        variablesMetode2(25);
        variablesMetode2(45409);
    }

    public static void variablesMetode(int a){
        //Declaració de variables --> no podem declarar variables que tinguen el mateix nom que un paràmetre
        int a1=3, b=6; //a=3 --> no puc declarar una variable que es digue a, com el paràmetre

        System.out.println(a);

    }

    public static void variablesMetode2(int a){
        //Declaració de variables
        //....
        boolean b=true;
        a=3;        //aquí no declarem una variable a, sinó assignem un valor al paràmetre a

        System.out.println(a);
        //System.out.println(b); --> b no existix dins d'este mètode, si no la declaro
    }


}
