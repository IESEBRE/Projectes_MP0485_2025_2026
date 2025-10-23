package explicacions;

public class CadenaIV {

    static void main() {

        IO.println("abcde".compareTo("abcde"));
        IO.println("abcde".compareTo("abce"));
        IO.println("abcde".compareTo("abcd"));

        IO.println("a".compareTo("A"));
        IO.println("A".compareTo("a"));
        IO.println("a".compareToIgnoreCase("A"));

        IO.println("abcde".contains("bc"));
        IO.println("abcde".contains("bd"));



    }

}
