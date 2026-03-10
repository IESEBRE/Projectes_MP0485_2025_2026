package anidades;

public class Lambda {

    public void metode(){
        System.out.println("Desperteu!!");
    }

}

class Maine{

    static void main() {

        //Declaro un objecte de la classe Lambda
        Lambda l=new Lambda();
        l.metode();

        //Declaro un objecte d'una classe anònima
        Lambda l2=new Lambda(){

            @Override
            public void metode() {
                System.out.println("Estic dins d'una classe anònima!!");;
            }
        };
        l2.metode();

    }

}
