package exercicis;

public class Exercici4 {

    public static String insertaCadena(String primer, String segon, int pos){
        //Tractament de casos especials
        //if(primer==null && segon==null) return null;
        if(primer==null ) return segon;
        if(segon==null ) return primer;
        if(pos<0) pos=0;
        if(pos>primer.length()) pos=primer.length();

        //Insertem el segon text dins del primer a partir de la posició pos
        //Opció 1
        String resultat="";

        //Extraem el primer tros de primer
        for (int i = 0; i < pos; i++) {
            resultat+=primer.charAt(i);
        }
        //Insertem el segon text
        resultat+=segon;

        //Concatenem el segon de tros de preimer
        for (int i = pos; i < primer.length(); i++) {
            resultat+=primer.charAt(i);
        }

        //return resultat;

        //Opció 2
        return primer.substring(0,pos)+segon+primer.substring(pos);
    }



}
