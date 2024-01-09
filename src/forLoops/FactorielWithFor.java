package forLoops;

import java.util.Scanner;

public class FactorielWithFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorielResult = 1;


        System.out.print("Write factoriel number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorielResult = factorielResult * i;
        }

        System.out.printf("Factoriel is: %d", factorielResult);
    }
}




