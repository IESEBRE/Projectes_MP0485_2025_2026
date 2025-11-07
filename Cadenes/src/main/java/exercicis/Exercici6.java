package exercicis;

public class Exercici6 {

    static void main() {
        //Declaració de variables
        String text="";             //necessari inicialitzar el text en element neutre de la concatenació +
        int compt=0;
        boolean esParaula=false;    //variable que estarà a true quan recorrem una paraula i a false quan recorrem separadors

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

        String separadors=" ,'\n.;:";

        for (int i = 0; i < text.length(); i++) {
            char lletra=text.charAt(i);
            if(esParaula){  //estavem dins d'una paraula
                if(separadors.contains(Character.toString(lletra))){        //si trobem un c aracter separador
                    esParaula=false;                                        //apuntem que estem fora d'una paraula
                }
            }
            else    //estavem dins de separadors
            {
                if(!separadors.contains(Character.toString(lletra))){       //si trobem un caracter no separador
                    esParaula=true;                                         //apuntem que estem dins de paraula
                    compt++;                                                //afaegim una nova paraula al comptador
                }
            }
        }
        //Mostrem el resultat
        IO.println(String.format("El text:%n\"%s\"%nconté %d paraules.", text, compt));

    }
}
