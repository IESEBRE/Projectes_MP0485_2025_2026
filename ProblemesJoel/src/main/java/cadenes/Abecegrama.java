package cadenes;

public class Abecegrama {


    static void main() {
        //Declaració de variables
        int numCasos;
        String lletres;
        int index;
        boolean esAbecegrama=true;

        //0. Llegim el número de casos a tractar
        numCasos=Integer.parseInt(IO.readln());


        //1. Preparem la cadena i index que usarem per comprovar la lletra de cada paraula
        lletres="abcdefghijklmnñopqrstuvwxyz";
        index=0;

        //2. Per cada cas a tractar
        //2.1. Llegim la paraula
        //2.2. Comprovem si comença en la lletra corresponent de l'alfabet
        while(numCasos>0){
            //Tractem el cas actual
            //2.1. Llegim la paraula
            String paraula=IO.readln();
            //2.2. Mirem si la paraula comença per la lletra corresponent
            esAbecegrama=esAbecegrama && paraula.charAt(0)==lletres.charAt(index);
            index++;
            if(index==28) index=0;
            //Decrementem el número de casos
            numCasos--;
        }

        //2.3. Mostrem el resultat segons si hem trobat o no un abcegrama
        IO.println(esAbecegrama?"SI":"NO");

    }
}
