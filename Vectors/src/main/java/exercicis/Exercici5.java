package exercicis;

public class Exercici5 {

    static void main() {

        //Declaració de variables
        int quantitat;              //quantitat de valors a tractar (triat per l'usuari)
        int[] vector;               //on guardarem els valors introduits per l'usuari --> no sabem encara la quantitat de caselles necessàries
        int suma=0;                 //on guardarem la suma dels valors introduits (per poder calcular la mitjana)
        double mitjana;             //on guardarem la mitjana

        //Demanem a l'usuari que escrigue una quantitat de valors
        do{
            quantitat=Integer.parseInt(IO.readln("Quants valors vols introduir (>=0): "));
            if(quantitat<0) IO.println("Ha de ser major o igual que 0!!");
            else break;
        }while(true);

        //només demano valors en cas que quantitat sigue més gran que 0
        if(quantitat>0) {
            //Ara que ja sabem la quantitat de valors, podem instanciar el vector
            vector = new int[quantitat];

            //Ara demanem els "quantitat" valors a l'usuari
            IO.println(String.format("Introduix %d valors enters:", quantitat));
            for (int i = 0; i < vector.length; i++) {
                vector[i] = Integer.parseInt(IO.readln());
                suma += vector[i];        //suma=suma+vector[i]
            }

            //Calculem la mitjana
            mitjana=(double) suma/quantitat;  // suma*1.0 / quantitat*1.0

            //Recorrem de nou el vector i mostrem els majors o iguals que la mitjana
            IO.println(String.format("Els valors majors o iguals que %.2f són:", mitjana));
            for (int i = 0; i < vector.length; i++) {
                if(vector[i] >= mitjana) IO.println(vector[i]);
            }
        }
    }
}
