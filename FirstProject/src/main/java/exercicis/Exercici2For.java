package exercicis;

public class Exercici2For {

    static void main() {

        //Declaració de variables

        for(int i=-50; i<=50 ; i=i+1){
            IO.print(i);
            if( i%2 == 0) IO.println(" és parell.");
            else IO.println(" és imparell.");
        }

        for(int i=-50; i<=50 ; i=i+1)
            IO.print(i + ( i%2 == 0 ? " és parell." : " és imparell."));




    }

}
