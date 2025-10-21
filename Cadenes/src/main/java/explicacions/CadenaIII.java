package explicacions;

public class CadenaIII {

    static void main() {
        String text="Vaig a recorrer les lletres del text";
        int comptEs=0;

        //Anem el recorrer el text lletra a lletra --> bucle
        for (int i = 0; i < text.length(); i++) {
            System.out.format("La lletra en posició %d és la %c%n", (i+1),text.charAt(i));
            if(text.charAt(i)=='e' || text.charAt(i)=='E') comptEs++;
        }

        System.out.println("Número de Es trobades: "+comptEs);


    }
}
