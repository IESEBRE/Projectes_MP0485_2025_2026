package abstracta;

//Les classes abstractes solen ser classes que agrupen propietats i mètodes d'altres classes estretament relacionades
//i de les quals no interessa instanciar objectes (no té sentit)


//Per ser abstracta la classe ha de portar la parula reservada abstract --> les classes abstractes no es poden instanciar
public abstract class Abstracta {

    //propietats
    private int numero;

    //No és obligatori però una classe abstracta SOL portar mètodes abstractes --> aquell que no té cos, no està implementat
    public abstract int retornaValor();

    //mètode no abstractes
    public void noAbstracte(){
        System.out.println("Sóc un mètode no abstracte");
    }

}


class Prova{

    static void main(String[] args) {
        //Abstracta objecte=new Abstracta();
        //Figura f=new Figura();
        Figura f=new Quadrat(23.5);
        Figura.metodeNoAbstracteEstatic();
    }
}

//Anem a construir classes per representar figures geomètriques bidimensionals
abstract class Figura{

    //Totes les figures tindran un mètode per calcular l'àrea
    public abstract double calcularArea();

    //Mètode que imprimix quin tipo de figura és
    public abstract void imprimirTipoFigura();

    //Mètode estàtic no abstracte --> s'accedix des de la propia classe
    public static void metodeNoAbstracteEstatic(){
        System.out.println("Sóc un metode no abstracte i estàtic");
    }
}

//Classe Quadrat
class Quadrat extends Figura{

    //Propietats dels cuadrats
    private double costat;

    //Constructor


    public Quadrat(double costat) {
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return costat*costat;
    }

    @Override
    public void imprimirTipoFigura() {
        System.out.println("Sóc un quadrat");
    }
}

class Triangle extends Figura{

    //Propietats
    private double base;
    private double altura;

    //Constructor


    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }


    @Override
    public void imprimirTipoFigura() {
        System.out.println("Sóc un triangle");
    }
}