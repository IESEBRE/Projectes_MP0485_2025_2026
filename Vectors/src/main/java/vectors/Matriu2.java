package vectors;

public class Matriu2 {

    static void main() {

        String[][][] textos=new String[5][4][3];

        //Recorregut
        for (int i = 0; i < textos.length; i++) {
            for (int j = 0; j < textos[i].length; j++) {
                for (int k = 0; k < textos[i][j].length; k++) {
                    if(i%2==0) textos[i][j][k]=String.format("Casella %d, %d, %d", i, j, k);
                    IO.print(String.format("%s ",textos[i][j][k]));
                }
                IO.println();
            }
            IO.println();
        }

    }
}
