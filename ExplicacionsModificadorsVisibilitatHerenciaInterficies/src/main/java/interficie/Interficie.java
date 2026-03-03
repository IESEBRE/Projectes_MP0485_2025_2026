package interficie;

//Les interfícies no es poden instanciar
//Engloba comportaments comuns però de classes que no tenen per què estar estretament relacionades

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Random;

public interface Interficie {

    //No poden incloure propietats no constants

    //Declaracions de constants
    public static final int CONSTANT1=20;       //el public static final no cal posar-ho
    int CONSTANT2=25;

    //Mètodes abstractes
    public abstract void metodeAbstracte1();    //el public abstract és opcional
    void metodeAbstracte2();

     //Mètodes estàtics
    public static void metodeEstatic( ){
        System.out.println("Sóc un mètode estàtic");
    }

    //Mètodes per defecte
    public default void metodePerDefecte(){
        System.out.println("Sóc un mètode per defecte");
    }
}


interface Secundaria{}

//Les interficies SI tenen HERÈNCIA MÚLTIPLE
interface Filla extends Secundaria, Interficie{}


class Prova{

    static void main(String[] args) {
        //Interficie i=new Interficie() ;
        Interficie.metodeEstatic();
        System.out.println(Interficie.CONSTANT1);
        System.out.println(Interficie.CONSTANT2);
    }

}

//En Java l'herència és simple però se poden implementar MULTIPLES interficies --> sera paregut a tindre herència MULTIPLE
class ImplementaInterficie implements Interficie, Secundaria, Serializable {


    @Override
    public void metodeAbstracte1() {

    }

    @Override
    public void metodeAbstracte2() {

    }
}

//Anem a fer una classe inventada que implemente interfícies de Java
class ElMeuScanner implements Closeable, Iterator, Comparable {


    @Override
    public void close() throws IOException {
        System.out.println("Acabo de tancar l'escanner");
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        Random r=new Random();
        return r.nextInt(2);
    }
}


