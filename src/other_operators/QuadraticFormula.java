package other_operators;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        double x1;
        double x2;
        double a;
        double b;
        double c;

        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruani a: ");
        a = reader.nextDouble();

        System.out.println("Shkruani b: ");
        b = reader.nextDouble();

        System.out.println("Shkruani c: ");
        c = reader.nextDouble();


        double dis = Math.sqrt(b * b - 4.0 * a * c);

        double emruesi = 2.0 * a;

        x1 = (-b + dis) / emruesi;

        x2 = (-b - dis) / emruesi;

        System.out.println(x1);
        System.out.println(x2);
    }
}
