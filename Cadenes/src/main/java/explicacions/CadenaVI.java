package explicacions;

public class CadenaVI {

    static void main() {

        IO.println("abc123def".substring(3));

        IO.println("abc123def".substring(3, 6));

        IO.println("abc123def".substring("abc123def".indexOf('1'), "abc123def".indexOf('d')));

        //peta si:
        //beginIndex <0
        //beginIndex > endIndex
        //endIndex > length()
        IO.println("abc123def".substring(3,"abc123def".length()+1));

    }
}
