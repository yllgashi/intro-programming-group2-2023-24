package string_functions;

public class StringFunctions {
    public static void main(String[] args) {
        String a = "abcdef";

        // charAt()
        char charOne = a.charAt(0); // qasja me indeks
        char charTwo = a.charAt(5); // qasja me indeks
        System.out.println(charOne);
        System.out.println(charTwo);

        // length()
        int stringLength = a.length();
        System.out.println(stringLength); // vlera totale (numerimi fillon prej 1, jo prej 0)
        // rangu i indeksave ne string eshte (0 - string.length()-1)
        // shembull "abc" eshte (0 - "abc".length() - 1) -> (0 - 2)


        // format()
        System.out.printf("Stringu %s %n", a); // Ketu vetem shfaqet vlera, nuk ruhet askund
        String b = String.format("Stringu %s %n", a); // Vleren e formatuar e ruajme ne nje String te ri
        System.out.println(b);

        // substring(int beginIndex)
        // substring nuk e ndryshon vleren e Stringut origjinal, vetem e kthen nje String te ri me ate qe e kemi kerkuar
        String myName = "Yll Gashi";
        String surname = myName.substring(4);
        System.out.println(myName);
        System.out.println(surname);

        // substring(int beginIndex, int lastIndex + 1)
        String myNameTwo = "Yll Gashi";
        String halfOfSurnameTwo = myName.substring(4, 6);
        System.out.println(myNameTwo);
        System.out.println(halfOfSurnameTwo);
    }
}
