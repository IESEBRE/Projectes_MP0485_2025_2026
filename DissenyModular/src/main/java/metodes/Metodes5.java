package metodes;

public class Metodes5 {

    public static void main(String[] args) {
        elMeuFormat("hola ");           //0 params variables
        elMeuFormat("hola ", null);//1 params variables
        elMeuFormat("hola %s", "món");//1 params variables
        elMeuFormat("hola %s, avui és %s", "món", "25");//2 params variables

        elMeuFormat2(); //0 params variables
        elMeuFormat2(null);//1 params variables
        elMeuFormat2(new String[]{"hola", "bon dia"});//2 params variables
        elMeuFormat2("hola", "bon dia");//2 params variables

        String[] s=null;
        //elMeuFormat3(); //0 params variables
        elMeuFormat3(s);//1 params variables
        elMeuFormat3(new String[]{"hola", "bon dia"});//2 params variables
        //elMeuFormat3("hola", "bon dia");//2 params variables


    }

    //Per fer el format necessitem un número variable de paràmetres --> de 0 a n
    public static void elMeuFormat(String cadena, String... params){
        //codi que implementa el format
        if(params==null) return;
        //Anem a mostrar el contingut de params
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }
    }

    //No podem tindre més d'un paràmetre variable al mateix mètode
    /*public static void elMeuFormat(String cadena, String... params, int... nums) {
    }*/

    public static void elMeuFormat2(String... params) {
    }

    public static void elMeuFormat3(String[] params) {
    }

    /*
    public static void elMeuFormat(String cadena){
        //codi que implementa el format
    }

    public static void elMeuFormat(String cadena, String param){
        //codi que implementa el format
    }

    public static void elMeuFormat(String cadena, String param1, int param2){
        //codi que implementa el format
    }
*/
}


