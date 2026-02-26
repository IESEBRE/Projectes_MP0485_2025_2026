package herencia.progenitor;

import java.util.Scanner;

public class Progenitor {

    //Propietats
    public int propPublica;                     //accessible d'arreu
    protected int propProtegida;                //accessible des del propi paquet i...
    int propPrivadaPaquet;                      //accessible des del propi paquet
    private int propPrivada;                    //accessible NOMÉS dins de la pròpia classe


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Progenitor{");
        sb.append("propPublica=").append(propPublica);
        sb.append(", propProtegida=").append(propProtegida);
        sb.append(", propPrivadaPaquet=").append(propPrivadaPaquet);
        sb.append(", propPrivada=").append(propPrivada);
        sb.append('}');
        return sb.toString();
    }

    static void main(String[] args) {
        Object o=new Object();
        Progenitor p=new Progenitor();
        Descendent d=new Descendent(1,2,3);

        //Implicacions de la herència
        Progenitor p2=new Descendent(1,2,3);
        Object o2=new Progenitor();

        System.out.println(((Progenitor)o2).propPublica);   //faig un casting d'Object a Progenitor



        System.out.println(o);
        System.out.println(p);
        System.out.println(d);
    }

}

class Descendent extends Progenitor{

    public Descendent(int propPublica, int propPrivadaPaquet, int propProtegida){

        this.propPublica=propPublica;
        this.propPrivadaPaquet=propPrivadaPaquet;
        this.propProtegida=propProtegida;
    }

    //Sobrecàrrega de mètodes --> 1 mètode en diferents signatures (capçaleres) --> polimorfisme
    public void metodeSobrecarregat(){
        System.out.println("Seré un mètode sobrecarregat");
    }

    public void metodeSobrecarregat(int numero){
        System.out.println("Sóc un mètode sobrecarregat en un paràmetre "+numero+ " i no retorno res");
    }

    public int metodeSobrecarregat(int numero, char segonParametre){
        System.out.println("Sóc un mètode sobrecarregat en 2 paràmetres i que retorna un 0");
        return 0;
    }
}