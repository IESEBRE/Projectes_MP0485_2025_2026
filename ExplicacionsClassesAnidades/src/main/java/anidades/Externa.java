package anidades;

public class Externa {

    //Constants
    public static final int VALOR=9;
    //Propietats
    private int numero;

    //Classes anidades
    static class AnidadaEstatica{

        //Propietats, constructors, mètodes, ....
    }

    protected class AnidadaNoEstatica{      //inner classes

        //Propietats, constructors, mètodes, ....

    }

}

class AltraExterna{

}



class Main{

    static void main() {

        //Instanciem un objecte de la classe anidada estàtica
        Externa.AnidadaEstatica obj1=new Externa.AnidadaEstatica();

        //Instanciem un objecte de la classe anidada NO estàtica
        Externa obj2=new Externa();
        Externa.AnidadaNoEstatica obj3=obj2.new AnidadaNoEstatica();
    }





}
