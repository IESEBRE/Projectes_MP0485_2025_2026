package explicacions;

public class CadenaV {

    static void main() {

        IO.println("abcde".indexOf('c'));
        IO.println("abcde".indexOf('f'));


        IO.println("abcdecdfdfcdfdfdc".indexOf('c'));
        IO.println("abcdecdfdfcdfdfdc".lastIndexOf('c'));

        //Vull saber a quines posicions es troba la lletra c
        IO.println("abcdecdfdfcdfdfdc".indexOf('c',0));
        IO.println("abcdecdfdfcdfdfdc".indexOf('c',3));
        IO.println("abcdecdfdfcdfdfdc".indexOf('c',6));
        IO.println("abcdecdfdfcdfdfdc".indexOf('c',11));
        IO.println("abcdecdfdfcdfdfdc".indexOf('c',17));

        //Fem el mateix usant un bucle
        int index=0;
        do{
            int resultat="abcdecdfdfcdfdfdc".indexOf("cd",index);
            IO.println(resultat);
            if (resultat==-1) break;
            index=resultat+1;
        }while(true);

    }

}
