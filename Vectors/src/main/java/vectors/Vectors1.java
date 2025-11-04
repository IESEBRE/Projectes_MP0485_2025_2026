package vectors;

public class Vectors1 {


    static void main() {
        //Declaració de variables
        int a,b,c,d,e;
        b=23;
        //El mateix fet en un sol vector
        int[] vector;                       //declarem un vector d'enters
        vector=new int[5];                  //instanciem el vector en un objecte de 5 caselles enteres

        //Una altre vector declarat instanciat en una sola instrucció
        char[] text= new char[2];

        //vector d'objectes
        String[] objectes=new String[1];

        //Recorrem un dels vectors
        for (int i = 0; i < vector.length; i++) {
            IO.println(vector[i]);
        }

        //Miro la longitud del vector
        a=vector.length;
        IO.println(String.format("La longitud del vector és %d", a));
    }




}
