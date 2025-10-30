package cadenes;

public class BloodBorne {

    static void main() {
        //Declaració de variables
        int numCasos;

        //1. Llegim el número de casos a tractar
        numCasos=Integer.parseInt(IO.readln());

        //2. Per cada cas a tractar
        //2.1. Llegim la paraula
        //2.2. Recorrem la paraula en busca de repeticions
        //2.3. Mostrem el resultat segons si hem trobat o no repeticions
        while(numCasos>0){
            //Tractem el cas actual
            //2.1. Llegim la paraula
            String paraula=IO.readln();
            //2.2. Recorrem la paraula en busca de repeticions
            boolean trobada=false;
            for (int i = 0; i < paraula.length()-1 && !trobada; i++) {
                trobada = (paraula.charAt(i)==paraula.charAt(i+1));
            }
            //2.3. Mostrem el resultat segons si hem trobat o no repeticions
            IO.println(trobada?"SI":"NO");

            //Decrementem el número de casos
            numCasos--;
        }

    }


}
