package datatypes;


// char (unicode character)
public class CharExample {
    public static void main(String[] args) {

        // first example
        char firstChar;
        firstChar = 'a';


        // second example
        char secondChar, thirdChar;
        secondChar = 'b';
        thirdChar = 'c';

        // third example
        char fourthChar = 'd';


        // fourth example
        char fifthChar = 65; // A (from unicode table)
        char anotherChar = '\u2605'; // star (https://www.ssec.wisc.edu/~tomw/java/unicode.html)


        // nje varg i chars
        System.out.println("Emri im eshte Ylli");


        // result
        System.out.println(fifthChar);
        System.out.println(anotherChar);
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(fourthChar);
    }
}
