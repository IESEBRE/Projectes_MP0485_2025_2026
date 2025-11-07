package vectors;

public class Vectors2 {

    static void main() {
        //Vectors unidimensionals
        int[] vector=new int[20];       //declaració + instanciació

        //Si inicialment ja coneixem el contingut del vector que necessitem
        int[] contConegut={1, 2, 3, 4, 5};      //així només ho podem fer si declarem + instanciem
        //contConegut={1, 2, 4, 5};             //si no declarem no podem instanciar d'esta forma

        contConegut=new int[]{1, 2, 3};
    }
}
