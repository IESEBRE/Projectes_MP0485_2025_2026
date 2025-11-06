package arrays;

public class EscriuArray4vIOMillorat {

    static void main() {
        //fem una primera lectura per arribar a la segona línia de la entrada
        IO.readln();
        int inc;

        //Obtenim un arry d'Strings en els números a tractar
        String[] numsSeparats=IO.readln().split(" ");

        //Llegim l'increment a aplicar als elements del vector
        inc=Integer.parseInt(IO.readln());

        //Mostrem els valors de l'array incrementats adequadament
        for (int i = 0; i < numsSeparats.length; i++) {
            IO.print(String.format("%d ", Integer.parseInt(numsSeparats[i])+inc));
        }

        IO.println();
    }
}
