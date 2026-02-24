package codifont;

//Modificador de visibilitat public --> tothom pot accedir-hi
public class ClasseExemple {

    //Modificadors dels membres de les classes --> propietats i mètodes

    //Propietats
    public int propPublica;                     //accessible d'arreu
    protected int propProtegida;                //accessible des del propi paquet i...
    int propPrivadaPaquet;                      //accessible des del propi paquet
    private int propPrivada;                    //accessible NOMÉS dins de la pròpia classe


    public int mostrarPrivada(){
        return propPrivada;
    }

    //Este mètode retorna false si no s'ha pogut canviar el valor i true si s'ha canviat
    public boolean modificarPrivada(int nouValor){
        if(nouValor<=0) return false;
        propPrivada=nouValor;
        return true;
    }


}

//Modificador de visibilitat package-private (quan no fiquem res) --> accessible des de classes del mateix paquet
class Auxiliar{ }
