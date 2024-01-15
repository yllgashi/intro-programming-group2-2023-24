package whileLoops.practice;

import java.util.Scanner;

public class IntegerDivisionTaskOne {
    public static void main(String[] args) {
        /*
            How many times does num2 contains value of num1
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number two: ");
        int num2 = scanner.nextInt();

        // Logic
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        System.out.println("Num1 contains num2: " + count);
    }
}
