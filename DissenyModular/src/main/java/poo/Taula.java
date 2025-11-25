package poo;

public class Taula {

    //Propietats de les taules que m'interessa guardar
    int llargada;
    int amplada;
    int altura;
    double pes;
    boolean esUnSolMaterial;

    //Mètodes de les taules
    //1. Constructors
    public Taula(){

    }
    public Taula(boolean paramEsUnSolMaterial){
        esUnSolMaterial=paramEsUnSolMaterial;
    }

    public static void main(String[] args) {
        Taula objecte=new Taula();
        Taula objecte1=new Taula(true);
    }

}
