package methods.examples;

import java.util.Scanner;

public class UshtrimeMetoda2 {
    public static void main(String[] args) {
        // example 1
//        int result = gjejProdhimin(2, 2);
//        System.out.println(result);

        // example 2
//        printNumbers(10);
//        printNumbers(20);

        // example 3
        int fac3 = gjejFaktorielin(3);
        int fac4 = gjejFaktorielin(4);
    }

    public static int gjejProdhimin(int a, int b) {
        return a * b;
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static int gjejFaktorielin(int n) {
        int factorielResult = 1;
        for (int i = 1; i <= n; i++) {
            factorielResult = factorielResult * i;
        }

        return factorielResult;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int sumInRange(int from, int to) {
        int result = 0;
        for (int i = from; i <= to; i++) {
            result += i;
        }

        return result;
    }
}




