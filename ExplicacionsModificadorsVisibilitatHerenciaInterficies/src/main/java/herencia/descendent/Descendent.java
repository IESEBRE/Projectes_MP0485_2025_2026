package herencia.descendent;

import herencia.progenitor.Progenitor;

import java.util.Random;
import java.util.Scanner;

public class Descendent extends Progenitor {

    public Descendent(int propPublica, int propProtegida){

        this.propPublica=propPublica;
        this.propProtegida=propProtegida;


    }


}

class ElMeuRandom extends Random {

    //Sobreescriptura de mètodes heredats --> polimorfisme
    @Override
    public int nextInt() {
        return 0;
    }
}