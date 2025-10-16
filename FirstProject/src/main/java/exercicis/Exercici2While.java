package exercicis;

public class Exercici2While {

    static void main() {

        //Declaració de variables
        int i=-50;
        while( i<=50 ){
            IO.println(i + ( i%2 == 0 ? " és parell." : " és imparell."));
            i=i+1;
        }

    }

}
