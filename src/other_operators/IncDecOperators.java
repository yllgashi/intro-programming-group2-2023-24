package other_operators;

public class IncDecOperators {
    public static void main(String[] args) {
        // +
        // -

        // first example
        int a = 10;
        System.out.println(a);

        a++;
        System.out.println(a);

        // second example
        int b = 10;
        System.out.println(b);

        b--;
        System.out.println(b);


        // third example (post-increment)
        int c = 10;
        System.out.println(c++); // 10 (value is incremented for next statement)

        // fourth example (pre-increment)
        int d = 10;
        System.out.println(++d); // 11 (value is incremented in this statement)
    }
}
