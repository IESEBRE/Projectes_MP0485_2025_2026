package org.example;

public class EstructuraCondicionalIII {

    static void main() {
        String diaSetmana="Dimarts";
        char lletra='A';

        //Vull mostrar un missatge diferent segons el dia de la setmana
        if(diaSetmana.equals("Dimarts")) IO.println("A les 8h programació");
        else if (diaSetmana.equals("Dimecres")) IO.println("A les 8h digitalització");
        else if (diaSetmana.equals("Dijous")) IO.println("A les 8h IPO");
        else if (diaSetmana.equals("Divendres")) IO.println("A les 8h programació");
        else if (diaSetmana.equals("Dissabte") || diaSetmana.equals("Diumenge")) IO.println("A les 8h a dormir");
        else if(diaSetmana.equals("Dilluns")) IO.println("A les 8h IPO");

        //SWITCH
        switch( diaSetmana ) {       //expressió
            case "Dilluns":
                IO.println("A les 8h IPO");
                break;
            case "Dimarts":
                IO.println("A les 8h programació");
                break;
            case "Dimecres":
                IO.println("A les 8h digitalització");
                break;
            case "Dijous":
                IO.println("A les 8h IPO");
                break;
            case "Divendres":
                IO.println("A les 8h programació");
                break;
            case "Dissabte":
                IO.println("A les 8h a dormir");
                break;
            case "Diumenge":
                IO.println("A les 8h a dormir");
                break;
        }

        //Ara vaig a simplificar una mica el switch anterior
        switch( diaSetmana ) {       //expressió
            case "Dilluns":
            case "Dijous":
                IO.println("A les 8h IPO");
                break;
            case "Dimarts":
            case "Divendres":
                IO.println("A les 8h programació");
                break;
            case "Dimecres":
                IO.println("A les 8h digitalització");
                break;
            case "Dissabte":
            case "Diumenge":
                IO.println("A les 8h a dormir");
                break;                              //Este break en ppi és opcional pk és l'ultim cas
        }

        //Switch en equivalent a l'else
        switch ( lletra ){
            case 'A' , 'E', 'I', 'O', 'U':
                IO.println("Sóc una vocal!!");
                break;
            default:                                //entrem aquí si no es complix cap cas
                IO.println("Sóc una consonant!!");
                break;                              //Este break en ppi és opcional pk és l'ultim cas
        }



    }
}
