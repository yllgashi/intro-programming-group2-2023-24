package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int numOne = 20;
        int numTwo = 13;

        // (+)
        int resultOne = numOne + numTwo;
        System.out.println(resultOne);

        // (-)
        int resultTwo = numOne - numTwo;
        System.out.println(resultTwo);

        // (*)
        int resultThree = numOne * numTwo;
        System.out.println(resultThree);

        // (/)
        double resultFourth = numOne / numTwo;
        System.out.println(resultFourth);

        // (%) mod
        int resultFifth = numOne % 2;
        System.out.println(resultFifth);
    }
}