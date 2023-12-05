package ushtrime1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ekuleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cent1;
        int cent2;
        int cent5;
        int cent50;
        int euro1;
        int euro2;

        System.out.print("Shkruaj sa 1 centsha i keni: ");
        cent1 = scanner.nextInt();

        System.out.print("Shkruaj sa 2 centsha i keni: ");
        cent2 = scanner.nextInt();

        System.out.print("Shkruaj sa 5 centsha i keni: ");
        cent5 = scanner.nextInt();

        System.out.print("Shkruaj sa 50 centsha i keni: ");
        cent50 = scanner.nextInt();

        System.out.print("Shkruaj sa 1 euroshe i keni: ");
        euro1 = scanner.nextInt();

        System.out.print("Shkruaj sa 2 euroshe i keni: ");
        euro2 = scanner.nextInt();


        System.out.printf("%n---------------------------------------%n");
        System.out.printf("1centshe     %5d %10.2f EUR%n", cent1, (cent1 * 0.01));
        System.out.printf("2centshe     %5d %10.2f EUR%n", cent2, (cent2 * 0.02));
        System.out.printf("5centshe     %5d %10.2f EUR%n", cent5, (cent5 * 0.05));
        System.out.printf("50centshe    %5d %10.2f EUR%n", cent50, (cent50 * 0.50));
        System.out.printf("1euroshe     %5d %10.2f EUR%n", euro1, (euro1 * 1.00));
        System.out.printf("2euroshe     %5d %10.2f EUR%n", euro2, (euro2 * 2.00));


        System.out.printf("%n---------------------------------------%n");
        double total = (cent1 * 0.01) + (cent2 * 0.02) + + (cent5 * 0.05) +
                (cent50 * 0.50) + (euro1 * 1.00) + (euro2 * 2.00);

        System.out.printf("Total      %18.2f EUR%n", total);

        System.out.printf("---------------------------------------%n");
        LocalDate date = LocalDate.now();

        System.out.printf("Data           %18s", date);
        System.out.printf("%n---------------------------------------%n");

    }
}
