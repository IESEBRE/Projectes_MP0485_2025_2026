package exercicis;

public class Exercici2DoWhile {

    static void main() {

        //Declaració de variables
        int i=-50;
        do{
            IO.println(i + ( i%2 == 0 ? " és parell." : " és imparell."));
            i=i+1;
        }while( i<=50 );

    }

}
