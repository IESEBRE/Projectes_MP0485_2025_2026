package exercicis;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Pregunta2 {

    public static void main(String[] args) {
        Scanner ent=new Scanner(in);
        int n=ent.nextInt();
        String[] vectorCad=new String[n];
        int[] vectorLong=new int[n];

        for (int i = 0; i < vectorCad.length; i++) {
            vectorCad[i]=ent.skip("[\r\n]*").nextLine();
            vectorLong[i]=vectorCad[i].length();
        }

        System.out.format("%s -> %s%n", Arrays.toString(vectorCad),Arrays.toString(vectorLong));

        ent.close();

    }
}
