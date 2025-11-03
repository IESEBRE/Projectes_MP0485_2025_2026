package exercicis;
/*
5. Fes un programa en Java que demane a l'usuari la introducció de pesos en kilograms de pizzes, i pare quan
s'introduisque una de pes 0.0. Els pesos s’indicaran utilitzant decimals, i després de cada pes introduït el
mostrarem en els següents formats:

ocupant 10 posicions, mostrant sempre el signe, i en 2 decimals
el mateix omplint en 0s per l’esquerra
en notació científica, mostrant l’E majúscula
de la manera més curta entre decimal i científica, en minúscules

En acabar ha d'informar de quants pesos (pizzes) s'han introduït.
Nota: les pizzes no poden tenir pes negatiu, per tant si l'usuari introduix alguna pizza en pes no positiu no s'ha de
comptabilitzar, ni mostrar-lo en diferents formats.

Exemple:

Introduix un pes en kilograms: 234.4

      +234,40
+000234,40
2,344000E+02
234,400

 */

public class Exercici5 {

    static void main() {
        //Declaració de variables
        double pesPizza;
        int comptPizzes=0;

        do{
            pesPizza=Double.parseDouble(IO.readln("Introduix un pes de pizza (0.0 per acabar):\n"));
            if(pesPizza>0) comptPizzes++;
            else if(pesPizza <0) continue;
            else break;
            //Mostrem el pes en els diferents formats demanats
            IO.println(String.format("%+10.2f", pesPizza));
            IO.println(String.format("%+010.2f", pesPizza));
            IO.println(String.format("%E", pesPizza));
            IO.println(String.format("%g", pesPizza));

        }while(true);

        IO.println(String.format("Has introduït %d pizzes!!", comptPizzes));

    }



}
