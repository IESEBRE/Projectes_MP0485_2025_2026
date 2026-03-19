package generics;

import java.util.Scanner;

public class Capsa {

    private Object contingut;

    public Capsa(Object contingut) {
        this.contingut = contingut;
    }

    public Object getContingut() {
        return contingut;
    }

    public void setContingut(Object contingut) {
        this.contingut = contingut;
    }
}

class Main{

    static void main() {

        Capsa c=new Capsa(new Scanner(System.in));
        c.setContingut("Hola");
        int valor=((Scanner)c.getContingut()).nextInt();

    }

}
