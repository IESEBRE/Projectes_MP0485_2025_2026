package exercicis;

public class Exercici48 {

    public static String reverseRec(String normal){
        if(normal.length()<=1) return normal;
        return normal.charAt(normal.length()-1) + reverseRec(normal.substring(0, normal.length()-1));
    }

}
