package coleccions;

import comparacio.Cotxe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class UsColeccions {

    static void main() {

        ArrayList<String> llista=new ArrayList<>();

        llista.add("hola");
        llista.add("hola");
        llista.add("hola");
        llista.add("adeu");

        for (String s:llista) {
            System.out.println(s);
        }

        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }


    }
}

class Us2{

    static void main() {
        Collection<Cotxe> col=new TreeSet<>();

        col.add(new Cotxe(1900));
        col.add(new Cotxe(1900));
        col.add(new Cotxe(1950));
        col.add(new Cotxe(1890));

        for(Cotxe c:col){
            System.out.println(c);
        }
    }


}
