package examens;

public class Pr2_2018_2019 {

    static void main() {

        //Declaració de variables
        String text="", buscat;

        int compt=0;                //compta quins caracters del segon text estan al primer

        //Primer demanem el text NO BUIT, format per una o més línies i acabat en punt
        IO.println("Introduix un text no buit format per una o més línies (per acabar escriu FI):");
        do {
            String linia = IO.readln().trim();      //eliminem possibles espais a esquerra i dreta usant trim()
            if (linia.isBlank()) continue;
            else {      //Si la línia conté caracters hem de mirar si és la paraula FI
                if(linia.equalsIgnoreCase("FI")){
                    text=text+linia;
                    break;
                }else{
                    text=text+linia+"\n";
                }
            }
        }while(true);

        //Primer demanem el text NO BUIT
        do {
            buscat = IO.readln("Introduix un text no buit:\n");
            if (buscat.isBlank()) IO.println("Ha de contenir algun caracter!!");
            else break;
        }while(true);

        System.out.println("Aparició dels caràcters:");

        //Recorrem el segon text
        for (int i = 0; i < buscat.length(); i++) {
            //Ara hem de buscar el caracter dins del text
            char caracter=buscat.charAt(i);

            System.out.format("El caracter '%c'", caracter);
            //Tercer comptem les aparicions del caracter dins del text utilitzant el mètode indexOf
            int index=0;
            boolean esPrimera=true;
            do{
                int resultat=text.indexOf(caracter,index);
                if (resultat==-1) {
                    if(esPrimera){          //Si és true vol dir que el caràcter no es troba dins del 2n text
                        System.out.println(" no apareix");
                    } else System.out.println();
                    break;
                }
                if(esPrimera){
                    System.out.format(" apareix a les posicions %d", resultat+1);
                    esPrimera=false;
                    compt++;                    //incrementem sense mirar cap condició
                } else System.out.format(", %d", resultat+1);
                index=resultat+1;           //important actualitzar l'índex a la ultima posició trobada més 1, sinó tindrem un bucle infinit
            }while(true);

        }

        System.out.format("%nHan aparegut %d caràcters d'un total de %d%n", compt, buscat.length());

    }


}
