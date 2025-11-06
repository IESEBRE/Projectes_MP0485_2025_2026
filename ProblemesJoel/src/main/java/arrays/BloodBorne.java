package arrays;

public class BloodBorne {

    static void main() {

        //Primer llegim el número de casos
        int numCasos=Integer.parseInt(IO.readln());

        //Bucle que tracta els casos
        while(numCasos-->0){
            //Tractem cada cas

            // declaració de variables
            boolean trobada=false;

            IO.readln();

            //Obtenim un array d'Strings en els números a tractar
            String[] numsSeparats=IO.readln().split(" ");


            //Mirem si hi ha repeticions
            for(int i = 0; i < numsSeparats.length-1 && !trobada; i++) {
                trobada = (numsSeparats[i].equals(numsSeparats[i+1]));
            }

            //2.3. Mostrem el resultat segons si hem trobat o no repeticions
            IO.println(trobada?"SI":"NO");
        }

    }
}
