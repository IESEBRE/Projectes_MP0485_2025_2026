package exercicis;

public class Exercici13 {

    static void main() {
        //Declaració de variables
        String text;

        //Primer demanem el text NO BUIT
        do {
            text = IO.readln("Introduix un text no buit:\n");
            if (text.isBlank()) IO.println("Ha de contenir algun caracter!!");
            else break;
        }while(true);

        //Abans de tractar el text eliminem els possibles espais a esquerra i dreta
        text=text.trim();

        //Fem el mateix usant un bucle
        int index=0, indexIni=0;
        do{
            int resultat=text.indexOf(" ",index);
            if (resultat==-1) {
                IO.println(text.substring(indexIni,text.length()));
                break;
            }
            String paraula=text.substring(indexIni,resultat);
            if(!paraula.isBlank()) IO.println(paraula);
            indexIni=resultat+1;

            index=resultat+1;
        }while(true);


    }
}
