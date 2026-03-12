package anidades;

public class Lambda {

    public void metode(){
        System.out.println("Desperteu!!");
    }

}

//Les interfícies que només tenen un mètode abstracte s'anomenen FUNCIONALS
interface Interficie{

    //Un sol mètode abstracte
    int metode(int param);

}

class Maine{

    static void main() {

        //Declaro un objecte de la classe Lambda --> l sí és de classe Lambda
        Lambda l=new Lambda();
        l.metode();

        //Declaro un objecte d'una classe anònima --> l2 no és de classe Lambda
        Lambda l2=new Lambda(){

            @Override
            public void metode() {
                System.out.println("Estic dins d'una classe anònima!!");;
            }
        };
        l2.metode();

        //Declarar un objecte que implementa la interficie funcional mitjançant una classe anònima
         Interficie i1=new Interficie() {
             @Override
             public int metode(int param) {
                 if(param>0) return 0;
                 return param%2;
             }
         };

        //Declarar un objecte que implementa la interficie funcional mitjançant una expressió lambda
        Interficie i2=(p)->p*2;

        //Declarar un altre objecte que implementa la interficie funcional mitjançant una expressió lambda
        Interficie i3=(param)->{
            if(param>0) return 0;
            return param%2;
        };
    }

}
