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
            String text=IO.readln().toLowerCase();          //passem el text a minúscula
            String resultat="";
            switch(notacio){
                case "P":
                    //Fem el mateix usant un bucle
                    int index=0, indexIni=0, compt=0;
                    do{
                        int trobat=text.indexOf(" ",index);
                        if (trobat==-1) {
                            if(compt==0) resultat=text.substring(indexIni,indexIni+1).toUpperCase()+text.substring(indexIni+1);     //el text contenia una sola paraula
                            else  resultat=resultat+text.substring(indexIni,indexIni+1).toUpperCase()+text.substring(indexIni+1);   //la ultima parula d'un text multiparaula
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula=text.substring(indexIni,indexIni+1).toUpperCase()+text.substring(indexIni+1,trobat);
                        if(!paraula.isBlank()){
                            if(compt==0) resultat=paraula;
                            else  resultat=resultat+paraula;
                            //IO.println(paraula);
                            compt++;
                        }
                        indexIni=trobat+1;

                        index=trobat+1;
                    }while(true);


                    break;
                case "K":
                    //Fem el mateix usant un bucle
                    index=0;
                    indexIni=0;
                    compt=0;
                    do{
                        int trobat=text.indexOf(" ",index);
                        if (trobat==-1) {
                            if(compt==0) resultat=text.substring(indexIni);
                            else  resultat=resultat+"-"+text.substring(indexIni);
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
                    //Fem el mateix usant un bucle
                    index=0;
                    indexIni=0;
                    compt=0;
                    do{
                        int trobat=text.indexOf(" ",index);
                        if (trobat==-1) {
                            if(compt==0) resultat=text.substring(indexIni);
                            else  resultat=resultat+"_"+text.substring(indexIni);
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula=text.substring(indexIni,trobat);
                        if(!paraula.isBlank()){
                            if(compt==0) resultat=paraula;
                            else  resultat=resultat+"_"+paraula;
                            //IO.println(paraula);
                            compt++;
                        }
                        indexIni=trobat+1;

                        index=trobat+1;
                    }while(true);

                    break;
                case "C":
                    //Fem el mateix usant un bucle
                    index=0;
                    indexIni=0;
                    compt=0;
                    do{
                        int trobat=text.indexOf(" ",index);
                        if (trobat==-1) {
                            if(compt==0) resultat=text.substring(indexIni);    //el text contenia una sola paraula
                            else  resultat=resultat+text.substring(indexIni,indexIni+1).toUpperCase()+text.substring(indexIni+1);   //la ultima parula d'un text multiparaula
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula;

                        if(compt==0) paraula=text.substring(indexIni, trobat);
                        else paraula=text.substring(indexIni,indexIni+1).toUpperCase()+text.substring(indexIni+1,trobat);
                        if(!paraula.isBlank()){
                            if(compt==0) resultat=paraula;
                            else  resultat=resultat+paraula;
                            //IO.println(paraula);
                            compt++;
                        }
                        indexIni=trobat+1;

                        index=trobat+1;
                    }while(true);

                    break;

            }

            //Mostro la cadena transformada
            IO.println(resultat);

            //Decrementem el número de casos
            numCasos--;
        }
    }
}
