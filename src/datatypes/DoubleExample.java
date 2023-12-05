package datatypes;

// double
// size => 64-bit
public class DoubleExample {
    public static void main(String[] args) {

        // first example
        double firstDouble;
        firstDouble = 10.40432425425;


        // second example
        double secondDouble, thirdDouble;
        secondDouble = 1.4123123123;
        thirdDouble = 2.452123123123;


        // third example
        double fourthDouble = 10.1312312312312;

        // result
        System.out.println(firstDouble);
        System.out.println(secondDouble);
        System.out.println(thirdDouble);
        System.out.println(fourthDouble);


        // math examples
        double squareRootOfTen = Math.sqrt(10);
        System.out.println(squareRootOfTen);


        double a = 10;
        a = a + .3; // same
        a = a + 0.3; // same
    }
}
