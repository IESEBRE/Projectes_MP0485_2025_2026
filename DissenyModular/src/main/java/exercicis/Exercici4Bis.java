package exercicis;

public class Exercici4Bis {

    /**
     * Inserta un text dins un altre a partir d'una posició especificada
     * @param primer text on volem insertar
     * @param segon text que volem insertar
     * @param pos posició en la qual volem insertar
     * @return el segon text insertar a la posició pos del primer
     * @throws NullPointerException si algun dels textos és null
     * @throws IllegalArgumentException si la posició és negativa o més gran que la llargada que el primer text
     */
    public static String insertaCadena(String primer, String segon, int pos) throws NullPointerException, IllegalArgumentException{
        //Tractament de casos especials
        if(primer==null ) throw new NullPointerException();
        if(segon==null ) throw new NullPointerException();
        if(pos<0 || pos>primer.length()) throw new IllegalArgumentException();

        return primer.substring(0,pos)+segon+primer.substring(pos);
    }

    public static void main(String[] args) {

        try {
            System.out.println(insertaCadena(null, "dskdjf", 909));
        }catch(NullPointerException ex){
            System.out.println("Error, algun dels textos és null!!");
        }catch(IllegalArgumentException ex){
            System.out.println("Error, posició indicada incorrecta!!");
        }

        try {
            System.out.println(insertaCadena("sdfdsf", "dskdjf", 909));
        }catch(IllegalArgumentException ex){
            System.out.println("Error, posició indicada incorrecta!!");
        }catch(NullPointerException ex){
            System.out.println("Error, algun dels textos és null!!");
        }

        try {
            System.out.println(insertaCadena("kkjkjk", "dskdjf", 1));
            throw new RuntimeException();
        }catch(NullPointerException | IllegalArgumentException ex){
            System.out.println("Error, algun dels paràmetres és incorrecte");
        }catch(RuntimeException ex){
            System.out.println("Hi ha hagut una excepció Runtime!!");
        }

        /* No es pot capturar abans a una mare que a una filla
        try {
            System.out.println(insertaCadena(null, "dskdjf", 998898));
        }catch(RuntimeException ex){
            System.out.println("Hi ha hagut una excepció Runtime!!");
        }catch(NullPointerException | IllegalArgumentException ex){
            System.out.println("Error, algun dels paràmetres és incorrecte");
        }
        */

    }



}
