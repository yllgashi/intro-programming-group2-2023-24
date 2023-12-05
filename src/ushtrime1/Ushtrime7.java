package ushtrime1;

import java.util.Scanner;

public class Ushtrime7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m;
        final double G = 9.8;
        double f;

        System.out.print("Shkruani masen: ");
        m = scanner.nextDouble();

        // kalkulimi (F = m * g)
        f = m * G;

        System.out.println("Forca eshte: " + f);
    }
}
