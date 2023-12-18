package string_functions;
public class StringExample {
    public static void main(String[] args) {
        /*
            String => Immutable (i pandryshueshem, ne momentin qe e bejm assign nje vlere te re, krijohet nje objekt i ri ne heap
            StringBuffer => E ndryshueshme (mundemi ne manovrojme, te nderrojme vleren e te njejtit objekt ne heap)
            StringBuilder => E ndryshueshme (mundemi ne manovrojme, te nderrojme vleren e te njejtit objekt ne heap)
         */

        String b; // Krijimi i pointerit (asaj qe referon apo tregon se ku gjendet objekti ne heap) - Ne stack
        b = "20"; // Krijimi i objektit - Ne heap

        // Pas kesaj "String a" ruhet ne Stack qe tregon se ku eshte  objekti "20" ne heap


        String a = "10"; // deklarimi i String
        a = "20"; // (nuk eshte ndryshim i vleres, eshte krijim i nje objekti te ri ne Heap - memorie kryesore)


        /*
            Examples:
         */

        // String (e pandryshueshme)
        String stringOne = "abc";
        stringOne = "def"; // po krijohet objekti i ri

        String stringTwo = new String("abc");
        stringTwo = new String("def");

        // StringBuilder (e ndryshueshme)
        StringBuilder stringBuilderOne = new StringBuilder();
        stringBuilderOne.append("abc");
        stringBuilderOne.append("def");

        System.out.println(stringBuilderOne);


        // StringBuilder (e ndryshueshme)
        StringBuffer stringBufferOne = new StringBuffer();
        stringBufferOne.append("abc");
        stringBufferOne.append("def");

        System.out.println(stringBufferOne);
    }
}






