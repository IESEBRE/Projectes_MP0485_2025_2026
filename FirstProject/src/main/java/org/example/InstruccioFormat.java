package org.example;

public class InstruccioFormat {

    static void main() {
        int edat=70;
        double pes= 70.45;

        char lletra='a';

        System.out.format("%c %n", lletra);
        System.out.format("%C %n", lletra);

        String missatge="La persona té "+edat+" anys i pesa "+pes+" kgs.";

        System.out.println(missatge);
        System.out.println("El número PI val "+Math.PI);

        System.out.format("Text fix%n");
        System.out.format("La persona té %d anys i pesa %.1f kgs.%n", edat, pes);
        System.out.printf("El número PI val %f%n", Math.PI);

        System.out.format("La persona té %d anys, medix %d cm i pesa %.1f kgs.%n", edat, 198, pes);

        IO.print(String.format("La persona té %d anys, medix %d cm i pesa %.1f kgs.%n", edat, 198, pes));

        IO.print(String.format("La persona té %o anys, medix %o cm i pesa %.1f kgs (en octal)%n", edat, 198, pes));

        IO.print(String.format("La persona té %X anys, medix %X cm i pesa %.1f kgs (en hexadecimal).%n", edat, 198, pes));
    }

}
