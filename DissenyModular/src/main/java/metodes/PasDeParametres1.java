package metodes;

public class PasDeParametres1 {

    public static void main(String[] args) {
        //Java SEMPRE fa pas de paràmetres per valor i per tant num no es modifica
        //Això només funciona així quan el paràmetre és de tipo primitiu
        int num=10;
        System.out.println("El valor de num és "+num);
        repParametre(num);
        repParametre(15);
        System.out.println("El valor de num és "+num);
    }

    public static void repParametre(int param){

        param=param+1;

        System.out.println("El valor de param és "+param);

    }


    public static boolean dataCorrecta(int dia, int mes, int any){
        return true;

    }



}
