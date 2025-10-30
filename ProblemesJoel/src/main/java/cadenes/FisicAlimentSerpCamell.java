package cadenes;

public class FisicAlimentSerpCamell {

    static void main() {
        //Declaració de variables
        int numCasos;

        //0. Llegim el número de casos a tractar
        numCasos=Integer.parseInt(IO.readln());

        while(numCasos>0){
            //1. Tractem cada cas
            String notacio=IO.readln();
            String text=IO.readln().toLowerCase();
            String resultat="";
            switch(notacio){
                case "P":
                    break;
                case "K":

                    //Fem el mateix usant un bucle
                    int index=0, indexIni=0, compt=0;
                    do{
                        int trobat=text.indexOf(" ",index);
                        if (trobat==-1) {
                            if(compt==0) resultat=text.substring(indexIni,text.length());
                            else  resultat=resultat+"-"+text.substring(indexIni,text.length());
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula=text.substring(indexIni,trobat);
                        if(!paraula.isBlank()){
                            if(compt==0) resultat=paraula;
                            else  resultat=resultat+"-"+paraula;
                            //IO.println(paraula);
                            compt++;
                        }
                        indexIni=trobat+1;

                        index=trobat+1;
                    }while(true);

                    break;
                case "S":
                    break;
                case "C":
                    break;

            }

            //Mostro la cadena transformada
            IO.println(resultat);

            //Decrementem el número de casos
            numCasos--;
        }
    }
}
