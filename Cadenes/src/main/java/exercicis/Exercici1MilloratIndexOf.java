package exercicis;

public class Exercici1MilloratIndexOf {

    static void main() {
        //Declaració de variables
        String text="";             //necessari inicialitzar el text en element neutre de la concatenació +
        char caracter;
        int index;
        int compt=0;

        //Primer demanem el text NO BUIT, format per una o més línies i acabat en punt
        IO.println("Introduix un text no buit format per una o més línies i acabat en punt:");
        do {
            String linia = IO.readln().trim();      //eliminem possibles espais a esquerra i dreta usant trim()
            if (linia.isBlank()) continue;
            else {      //Si la línia conté caracters hem de mirar si acaba en punt, ....
                if(linia.endsWith(".")){
                    text=text+linia;
                    break;
                }else{
                    text=text+linia+"\n";
                }
            }
        }while(true);

        //Segon demanem el caracter
        do {
            String resposta = IO.readln("Introduix el caracter a buscar:\n");
            if (resposta.isEmpty()) IO.println("Has d'escriure algun caracter!!");
            else{
                caracter=resposta.charAt(0);
                break;
            }
        }while(true);

        //Tercer comptem les aparicions del caracter dins del text utilitzant el mètode indexOf
        index=0;
        do{
            int resultat=text.indexOf(caracter,index);
            if (resultat==-1) break;
            compt++;                    //incrementem sense mirar cap condició
            index=resultat+1;           //important actualitzar l'índex a la ultima posició trobada més 1, sinó tindrem un bucle infinit
        }while(true);

        //Mostrem el missatge demanat
        IO.println(String.format("El caràcter ‘%c’ apareix %d vegades dins el text.", caracter, compt));



    }

}
