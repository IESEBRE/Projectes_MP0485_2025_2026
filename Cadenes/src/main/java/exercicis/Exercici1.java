package exercicis;

public class Exercici1 {

    static void main() {
        //Declaració de variables
        String text;
        char caracter;
        int compt=0;

        //Primer demanem el text NO BUIT
        do {
            text = IO.readln("Introduix un text no buit:\n");
            if (text.isBlank()) IO.println("Ha de contenir algun caracter!!");
            else break;
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

        //Tercer comptem les aparicions del caracter dins del text
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==caracter) compt++;
        }

        //Mostrem el missatge demanat
        IO.println(String.format("El caràcter ‘%c’ apareix %d vegades dins el text.", caracter, compt));



    }

}
