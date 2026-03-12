package anidades;

public class Externa {

    //Constants
    public static final int VALOR=9;
    //Propietats
    private int numero;

    //Classes anidades
    static class AnidadaEstatica{
        private int numero;
        //Propietats, constructors, mètodes, ....
        void prova(){
            //les classes estàtiques NO tenen accés als membres de la classe contenedora --> Externa
        }
    }

    protected class AnidadaNoEstatica{      //inner classes
        private int numero;
        //Propietats, constructors, mètodes, ....
        void prova(){
            //les classes NO estàtiques SÍ tenen accés als membres de la classe contenedora --> Externa
            numero=34;      //de qui és esta propietat?
        }
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
