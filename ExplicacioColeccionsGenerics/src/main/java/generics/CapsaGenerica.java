package generics;

import java.util.Scanner;

//Classe genèrica per què porta paràmetres de tipo --> T
public class CapsaGenerica <T>{

    private T contingut;

    public CapsaGenerica(T contingut) {
        this.contingut = contingut;
    }

    public T getContingut() {
        return contingut;
    }

    public void setContingut(T contingut) {
        this.contingut = contingut;
    }

    //Mètode genèric --> porta paràmetres de tipo just abans de declarar el tipo de retorn del mètode --> U
    public <U> void metodeGeneric(U param){
        System.out.println(param);
    }

    //Mètode genèric en paràmetre de tipo lligat --> N només admet tipos que hereden de Number
    public <N extends Number> N suma25(N param){
        return param;
    }
}

class Maine{

    static void main() {

        CapsaGenerica c0=new CapsaGenerica(new Scanner(System.in));//ús de la classe genèrica sense aprofitar els genèrics
        CapsaGenerica<Scanner> c=new CapsaGenerica<>(new Scanner(System.in));
        //c.setContingut("Hola"); --> el  generic m'avisa de que això és incorrecte
        int valor=c.getContingut().nextInt();       //els genèrics eliminen la necessita de fer casting

        //Ús del mètode genèric
        c.metodeGeneric("hola");  //ús del mètode genèric sense aprofitar els genèrics
        c.<Integer>metodeGeneric(new Integer(23));
    }

}
