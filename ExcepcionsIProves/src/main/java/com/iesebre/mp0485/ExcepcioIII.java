package com.iesebre.mp0485;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExcepcioIII {

    static void main() {
        //Exemple d'excepció CHECKED --> estem obligats a tractar-les
        try{
            ObjectInputStream objecte=new ObjectInputStream(new BufferedInputStream(System.in));
        }catch(IOException ex){
            System.out.println("Error a l'instanciar l'ob jecte");
        }

    }
}
