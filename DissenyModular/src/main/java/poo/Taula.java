package poo;

public class Taula {

    //Constants de la classe
    public final static double INDEX_DURESA=2.345;

    //Propietats de les taules que m'interessa guardar
    //Modificadors de visibilitat --> public, protected, package private, class private
    public int llargada=100;        //valor per defecte 100
    protected int amplada;
    int altura;
    //Normalment les propietats solen ser private
    private double pes=15.25;       //valor per defecte 15.25
    private boolean esUnSolMaterial;

    //Mètodes de les taules
    //1. Constructors
    public Taula(){

    }
    public Taula(boolean paramEsUnSolMaterial){

        this.esUnSolMaterial=paramEsUnSolMaterial;
    }

    public Taula(int llargada, int amplada, int altura, double pes, boolean esUnSolMaterial) {
        this.llargada = llargada;  //si el paràmetre i la propietat se diuen igual cal ficar this. davant la propietat
        this.amplada = amplada;
        this.altura = altura;
        this.pes = pes;
        this.esUnSolMaterial = esUnSolMaterial;
    }

    public Taula(int llargada) {
        this.llargada=llargada;
    }

    //2. Accessors --> getters i setters

    public double getPes() {                    //Els getters de props NO booleanes se diuen getNomPropietat
        return pes;
    }

    public boolean setPes(double pes) {
        if(pes<0 || pes>200) return false;
        this.pes = pes;
        return true;
    }

    public boolean isEsUnSolMaterial() {        //Els getters de props booleanes se diuen isNomPropietat
        return esUnSolMaterial;
    }

    public void setEsUnSolMaterial(boolean esUnSolMaterial) {
        this.esUnSolMaterial = esUnSolMaterial;
    }

    public static void main(String[] args) {
        //declaració de variables
        Taula objecte=new Taula();
        Taula objecte1=new Taula(true);
        Taula objecte2=new Taula(45,47,42,56.5,true);
        Taula objecte3=new Taula(25);

    }

}

class Instanciadora{

    public static void main(String[] args) {
        System.out.println("La constant duresa val "+Taula.INDEX_DURESA);


        Taula taula=new Taula();
        System.out.println("La constant duresa val "+taula.INDEX_DURESA);
        if(taula.setPes(250.99)) System.out.println("S'ha canviat el pes");
        else System.out.println("Pes incorrecte");;
        System.out.println(taula.getPes());
        //taula.pes=45.67;

        Math.asin(34.56);
    }



}
