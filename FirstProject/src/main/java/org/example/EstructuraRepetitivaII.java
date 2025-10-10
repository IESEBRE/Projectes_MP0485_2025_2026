package org.example;

public class EstructuraRepetitivaII {

    static void main() {

        //Declaració de variables
        int numero,
                suma=0;     //inicialitzem en l'element neutre de la suma

        //Bucle que sume els números introduits fins que introduim -1
        //Usem do_while perquè volem iterar d'1 a n vegades
        do{
            numero=Integer.parseInt(IO.readln("Introduix un número (-1 per acabar):\n"));
            //Acumulem els números a la variable suma
            suma=suma+numero;
        }while(numero!=-1);
        IO.println("La suma dels valors és "+suma);

        //Bucle que sume els números introduits fins que introduim -1 i sortint en la sentència break
        //Usem do_while perquè volem iterar d'1 a n vegades
        do{
            numero=Integer.parseInt(IO.readln("Introduix un número (-1 per acabar):\n"));
            if(numero==-1){
                suma--;
                break;
            }
            //Acumulem els números a la variable suma
            suma=suma+numero;
        }while(true);

        IO.println("La suma dels valors és "+suma);

        //Bucle que sume els números introduits fins que introduim -1 i sortint en la sentència break
        //Usem do_while perquè volem iterar d'1 a n vegades
        do{
            numero=Integer.parseInt(IO.readln("Introduix un número (-1 per acabar):\n"));
            //Acumulem els números a la variable suma
            suma=suma+numero;
            if(numero==-1) break;
        }while(true);

        IO.println("La suma dels valors és "+suma);


    }
}
