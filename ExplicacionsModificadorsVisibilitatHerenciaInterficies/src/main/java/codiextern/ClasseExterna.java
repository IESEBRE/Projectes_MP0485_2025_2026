package codiextern;

import codifont.*;  //els imports s'han de posar obligatòriament quan accedim a classes situades a altres paquets

public class ClasseExterna {

    static void main(String[] args) {

        ClasseExemple nom=new ClasseExemple();     //puc accedir a una classe pública situada a un altre paquet
        //Auxiliar nom2=null;       no puc accedir-hi a una classe package-private situada a un altre paquet

        //Accedim ales propietats de la classe exemple --> només puc accedir a la pública des d'una classe d'un altre paquet
        nom.propPublica=-234;
        nom.modificarPrivada(-24);
        System.out.println(nom.propPublica);
        System.out.println(nom.mostrarPrivada());
    }
}
