package debugPractice;

import java.util.Scanner;

public class DebugExampleTwo {
    /*
        Find factors of a number, ex: 98 = 2 * 7 * 7
        The factor of a number, in math, is a divisor of the given number that divides it completely, without leaving any remainder

        98 % 2 == 0 (we find first factor 2)
        (98 / 2) % 7 == 0 (we find second factor 7)
        ((98 / 2) / 2) % 7 == 0 (we find third factor 7)

        OR

        98 % 2 == 0 (we find first factor 2)
        49 % 7 == 0 (we find second factor 7)
        7 % 7 == 0 (we find third factor 7)

        REMINDER:
        0, 1 -> shouldn't be factors
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Execute 1:
        long n = scanner.nextLong();

        for (i = 0; i < n; i++) {

            while (n % i == 0)
                System.out.println(i + " ")
                n = n / i


        }
        /*
            After executing we are getting:
                1. Cannot find symbol 'i'
                2. ';' excepted
            It means we have these bugs:
                1. We didn't write "int" before "i"
                2. We didn't write ";" after statements
                3. We found out that we need to add brackets of while body

         */


        // Execute 2:
        long n = scanner.nextLong();

        for (int i = 0; i < n; i++) {

            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

        }
        /*
            We fixed syntax errors with the help of compiler, but after trying with different n values, we found out that:
                1. n can be send as blank (not number)
                2. When dividing at first iteration with i = 0, we get DivideByZero exception
                3. 0 and 1 are not factors so we need to exclude them and to start from 2
         */


        // Execute 3:
        long n = scanner.nextLong();

        for (int i = 2; i < n; i++) {

            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

        }
        /*
            We found these errors:
                1. If we set n = 5, we don't get result
                2. If we set n = 6, we get only 2 factoriel

            So for the next execution, try to print i and n values
         */


        // Execute 3:
        long n = scanner.nextLong();

        for (int i = 2; i < n; i++) {

            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

            System.out.println("TRACE" + i + " " + n);
        }
        /*
            We found out that:
                1. We need to print "n" if its not 1
         */


        // Execute 4:
        long n = scanner.nextLong();

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

            System.out.println("TRACE" + i + " " + n);
        }
        if (n > 1) System.out.println(n);
        System.out.println();
        /*
            Time to execute is slow
            In this case we don't need to iterate through smaller checked factors, because they are already checked,
            we made this by: "i <= n/i"
         */

        // Execute 5:
        long n = scanner.nextLong();

        for (int i = 2; i <= n / i; i++) {

            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

            System.out.println("TRACE" + i + " " + n);
        }
        if (n > 1) System.out.println(n);
        System.out.println();

        /*
            In this case we don't need to iterate through smaller checked factors, because they are already checked,
            we made this by: "i <= n/i"
         */


        // Final result:
        // Execute 5:
        long n = scanner.nextLong();

        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }
        if (n > 1) System.out.println(n);
        System.out.println();
        /*
            We removed debugging lines
         */
    }
}
