package comparacio;

public class ComparatorComparable {

    static void main() {
        Cotxe c1=new Cotxe(1900);
        Cotxe c2=new Cotxe(2026);

        if(c1.compareTo(c2)==0) System.out.println("Els 2 cotxes són iguals");
        else if(c1.compareTo(c2)>0) System.out.println("El primer cotxe és major que el segon");
        else System.out.println("El primer cotxe és menor que el segon");

        Cotxe c3=new Cotxe(1900);

        if(c1.compareTo(c3)==0) System.out.println("Els 2 cotxes són iguals");
        else if(c1.compareTo(c3)>0) System.out.println("El primer cotxe és major que el segon");
        else System.out.println("El primer cotxe és menor que el segon");

        if(c1.equals(c3)) System.out.println("Els 2 cotxes són iguals");
        else System.out.println("Els 2 cotxes no són iguals");
    }

}

