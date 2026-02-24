package codifont;

public class CopiaClasseExterna {

    static void main(String[] args) {

        ClasseExemple nom=new ClasseExemple();     //puc accedir a una classe pública situada al mateix paquet
        Auxiliar nom2=null;         //puc accedir a una classe package-private situada al mateix paquet

        //Accedim a les propietats de la classe exemple --> no puc accedir a la privada erò sí a la resta
        System.out.println(nom.propPublica);
        System.out.println(nom.propPrivadaPaquet);
        System.out.println(nom.propProtegida);


    }
}
