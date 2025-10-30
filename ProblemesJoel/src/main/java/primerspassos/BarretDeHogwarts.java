package primerspassos;

import java.util.Scanner;

import static java.lang.System.in;

public class BarretDeHogwarts {

    public static void main(String[] args) {
        Scanner ent=new Scanner(in);
        switch(ent.nextLine()){
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }

        ent.close();
    }

}
