package vectors;

public class Matriu1 {

    static void main() {

        //Vectors de més d'una dimensió
        //2 dimensions --> reben el nom de matrius
        int[][] matriu={{1, 2, 3},
                        {4, 5}};

        //Quan declares un vector multidimensional només és obligatori declarar la primera dimensió
        char[][][][][][][][][][][][][][][] cosaRara=new char[1][][][][][][][][][][][][][][];
        char[][][][][][][][][][][][][][][] cosaRara2=new char[1][4][6][][][][][][][][][][][][];

        //Exemple de com omplir una matriu declarant la longitud de la primera dimensió
        int[][] migPlena=new int[2][];
        migPlena[0]=new int[]{1,2,3};
        migPlena[1]=new int[]{4,5};

        //Recorregut d'una matriu
        for (int i = 0; i < matriu.length; i++) {       //bucle que recorre les files de la matriu
            for (int j = 0; j < matriu[i].length; j++) {
                IO.print(String.format("%d ",matriu[i][j]));
            }
            IO.println();
        }


    }
}
