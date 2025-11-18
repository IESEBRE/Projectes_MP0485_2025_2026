package metodes;

public class Metodes1 {

    //métode especial --> main , per què indica que la classe és executable
    public static void main(String[] args) {
        //Demanem a l'usuari que ompligue un vector d'Strings
        //.....

        //Anem a cridar al mètode de baix
        System.out.println(buscarMinimVector(new String[]{"hola", "adeu", "adeu", "bon dia"}, true));
        System.out.println(buscarMinimVector(new String[]{"hola", "adeu", "adeu", "bon dia"}, false));
    }

    //Anem a fer un altre mètode que busca el mínim dins d'un vector de cadenes
    //i retorna la posició on es troba el mínim. En cas de trobar el mínim repetit mostrarà la primera o darrera
    // aparició segons si el booleà es true o false
    public static int buscarMinimVector(String[] paraules, boolean mostrarPrimera){
        String min;
        int iMin;

        iMin=0;                 //faig la suposició de que la paraula menor està a la posició 0
        min=paraules[iMin];     //el minim inicial pot ser qualsevol casella del vector

        //Anem a buscar la paraula més menuda --> la 0 no cal mirar-la per què hem suposat que conté el mínim
        for (int i = 1; i < paraules.length; i++) {
            if(mostrarPrimera){
                if(paraules[i].compareTo(min)<0){
                min=paraules[i];
                iMin=i;
                }
            }else{
                if(paraules[i].compareTo(min)<=0){
                    min=paraules[i];
                    iMin=i;
                }
            }
        }

        //Retornem la posició de l'element més menut del vector
        return iMin;

    }

}

class Segona{


}
