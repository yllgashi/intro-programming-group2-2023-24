package debugPractice;

import java.util.Scanner;

public class DebugExampleOne {

    /*
        Check Threads & Variables in DEBUG mode
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            0 - validation
         */

        System.out.print("Write num1: ");
        int numOne = scanner.nextInt();

        System.out.print("Write num2: ");
        int divider = scanner.nextInt();

        System.out.println(numOne / divider);

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
