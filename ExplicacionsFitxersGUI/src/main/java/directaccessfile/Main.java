package directaccessfile;

import com.iesebre.code.DirectAccessFile;

import java.io.IOException;
import java.io.Serializable;

public class Main {


    static void main() {

        try {
            DirectAccessFile<Pojo> fitxer=new DirectAccessFile("santi2.dat");
            Pojo p=new Pojo("1r objecte", 1);

            //Guardem l'objecte p dins del fitxer
            //fitxer.writeObject(p);

            if(fitxer.writeObject(new Pojo("2n objecte", 2),23)) System.out.println("Objecte guardat");
            else System.out.println("Objecte no guardat");

            //Llegim tots els objectes que conté el fitxer
            fitxer.goToBeginning();
            while(true){
                 Pojo recuperat=fitxer.readObject();

                 //Sortim del bucle en quant el read retorna null
                 if(recuperat==null) break;

                 //Mostro l'objecte recuperat
                 System.out.println(recuperat);
            }

            //Tanquem el fitxer
            fitxer.close();
        } catch (IOException e) {
            System.out.println("Problema en crear el fitxer!!");;
        }


    }
}

class Pojo implements Serializable {

    //Propietats
    private String campCadena;
    private int campNumero;


    //Constructor de la classe
    public Pojo(String campCadena, int campNumero) {
        this.campCadena = campCadena;
        this.campNumero = campNumero;
    }

    public Pojo(String campCadena) {
        this.campCadena = campCadena;
    }

    public Pojo(int campNumero) {
        this.campNumero = campNumero;
    }

    public Pojo(){}

    //Getters and setters
    public String getCampCadena() {
        return campCadena;
    }

    public void setCampCadena(String campCadena) {
        this.campCadena = campCadena;
    }

    public int getCampNumero() {
        return campNumero;
    }

    public void setCampNumero(int campNumero) {
        this.campNumero = campNumero;
    }

    //Generem el mètode toString

    @Override
    public String toString() {
        return "Pojo{" +
                "campCadena='" + campCadena + '\'' +
                ", campNumero=" + campNumero +
                '}';
    }
}