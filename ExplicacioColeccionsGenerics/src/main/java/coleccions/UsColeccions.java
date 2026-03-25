package coleccions;

import comparacio.Cotxe;

import java.util.*;

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


class UsComparator{

    static void main() {
        Collection<Cotxe> col=new TreeSet<>(new Comparator<Cotxe>() {
            @Override
            public int compare(Cotxe o1, Cotxe o2) {
                return o1.getMarca().compareTo(o2.getMarca());
            }
        });

        col.add(new Cotxe("SEAT"));
        col.add(new Cotxe("FIAT"));
        col.add(new Cotxe("OPEL"));
        col.add(new Cotxe("TOYOTA"));
        col.add(new Cotxe("TOYOTA"));

        for(Cotxe c:col){
            System.out.println(c);
        }
    }


}


class UsMap{

    static void main() {
        HashMap<Integer,Cotxe> mapa=new HashMap<>();

        mapa.put(1,new Cotxe(1899));
        mapa.put(2,new Cotxe(1895));

        System.out.println(mapa.get(2));



    }





}
