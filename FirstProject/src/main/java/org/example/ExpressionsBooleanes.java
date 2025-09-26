package org.example;

public class ExpressionsBooleanes {

    static void main() {

        //Declaració de variables
        boolean esEstiu=false, esParell=true;
        boolean esImparell, esMajorQue9, esMajorOIgualQue9,
                esMenorQue9, esMenorOIgualQue9;
        esEstiu=esEstiu && esParell;    // && I lògica

        int numero=9;

        esParell= (numero%2 == 0);      // == igual
        esImparell= (numero%2 == 1);
        esImparell= (numero%2 != 0);    // != diferent
        esImparell = !esParell;         // ! negació

        esMajorQue9 = numero>9;         // > major
        esMajorOIgualQue9 = numero >= 9;// >= major o igual

        esMenorQue9 = numero < 9;       // < menor
        esMenorOIgualQue9 = numero <= 9;// <= menor o igual

        esEstiu = (numero%2 == 0) || (numero%2 != 0) && !(numero >= 9);
        esEstiu = (numero%2 == 0) || (numero%2 != 0) && !(true);
        esEstiu = (numero%2 == 0) || (numero%2 != 0) && false;
        esEstiu = (numero%2 == 0) || true && false;
        esEstiu = (numero%2 == 0) || false;
        esEstiu = false || false;
        esEstiu = false;

        //Ordre natural de les operacions lògiques
        esEstiu=esImparell && esMenorOIgualQue9 || esMajorQue9;
        esEstiu=(esImparell && esMenorOIgualQue9) || esMajorQue9;
        esEstiu=((esImparell && esMenorOIgualQue9) || esMajorQue9);

        //Si volem canviar l'ordre natural usarem parèntesis
        esEstiu=esImparell && (esMenorOIgualQue9 || esMajorQue9);
        esEstiu=(esImparell && (esMenorOIgualQue9 || esMajorQue9));
    }


}
