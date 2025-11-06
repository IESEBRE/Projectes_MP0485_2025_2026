package arrays;

public class ComptarEnArrays {

    static void main() {

        //Primer llegim el número de casos
        int numCasos=Integer.parseInt(IO.readln());
        int comptador=0;
        //Bucle que tracta els casos
        while(numCasos-->0){
            //declaració de variables
            int buscat;
            comptador=0;

            //Tractem cada cas
            IO.readln();

            //Obtenim un arry d'Strings en els números a tractar
            String[] numsSeparats=IO.readln().split(" ");

            //llegim el número buscat
            buscat=Integer.parseInt(IO.readln());

            //Comptem quantes vegades apareix el valor buscat
            for(int i = 0; i < numsSeparats.length; i++) {
                if(buscat==Integer.parseInt(numsSeparats[i])) comptador++;          //comparem enters
                //if(numsSeparats[i].equals(Integer.toString(buscat))) comptador++; //comparem Strings
                //if(numsSeparats[i].equals(buscat+"")) comptador++; //comparem Strings
            }

            //Mostrem el número de vegades que ha aparegut el valor buscat
            IO.println(comptador);
        }

    }
}
