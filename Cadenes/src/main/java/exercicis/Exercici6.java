package exercicis;

public class Exercici6 {

    static void main() {
        //Declaració de variables
        String text="";             //necessari inicialitzar el text en element neutre de la concatenació +
        int index;
        int compt=0;
        int indexIni;

        //Primer demanem el text NO BUIT, format per una o més línies i acabat en punt
        IO.println("Introduix un text no buit format per una o més línies:");
        do {
            String linia = IO.readln().trim();      //eliminem possibles espais a esquerra i dreta usant trim()
            if (linia.isBlank()) continue;
            else {      //Si la línia conté caracters hem de mirar si acaba en punt, ....
                if(linia.contains(".")){
                    text=text+linia;
                    break;
                }else{
                    text=text+linia+"\n";
                }
            }
        }while(true);

        String separadors=" ,'\n.";

        for (int i = 0; i < text.length(); i++) {
            char lletra=text.charAt(i);
            if(separadors.contains(Character.toString(lletra))) {
                IO.println("Separador trobat");
                compt++;
            }



        }



        //Mostrem el resultat
        IO.println(String.format("El text:%n\"%s\"%nconté %d paraules.", text, compt));

    }
}
