package switch_syntax.practice;

public class ArithmeticSwitch {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 0;
        char operator = '/';


        switch (operator) {
            case '+':
                System.out.println(numOne + numTwo);
                break;
            case '-':
                System.out.println(numOne - numTwo);
                break;
            case '/':
                if (numTwo != 0) {
                    System.out.println(numOne / numTwo);
                } else {
                    System.out.println("Numri dyte eshte 0, ndalohet pjestimi");
                }
                break;
            default:
                System.out.println("Operatori aritmetik nuk eshte menaxhuar");
                break;
        }
    }
}
