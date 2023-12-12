package IfElse.practice;

import java.util.Scanner;

public class IfElseOperacioniAritmetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.00;

        System.out.print("Numri i pare: ");
        int nrOne = scanner.nextInt();

        System.out.print("Numri i dyte: ");
        int nrTwo = scanner.nextInt();

        System.out.print("Zgjedh operacionin (+, -, *, /, %): ");
        char operacioniAritmetik = scanner.next().charAt(0);


        if (operacioniAritmetik == '+') {
            result = nrOne + nrTwo;
        } else if (operacioniAritmetik == '-') {
            result = nrOne - nrTwo;
        } else if (operacioniAritmetik == '*') {
            result = nrOne * nrTwo;
        } else if (operacioniAritmetik == '/') {
            if (nrTwo == 0) {
                System.out.println("Nuk lejohet pjestimi me 0");
            } else {
                result = (double) nrOne / nrTwo;
            }
        } else if (operacioniAritmetik == '%') {
            if (nrTwo == 0) {
                System.out.println("Nuk lejohet pjestimi me 0");
            } else {
                result = (double) nrOne % nrTwo;
            }
        } else {
            System.out.println("Operatori gabim");
        }

        System.out.printf("%d %c %d = %d %n", nrOne, operacioniAritmetik, nrTwo, nrOne % nrTwo);

    }
}









