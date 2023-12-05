package ushtrime1;

import java.util.Scanner;

public class KalkulatoriPare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        double a = scanner.nextDouble();

        System.out.print("Shkruani numrin e dyte: ");
        double b = scanner.nextDouble();

        double mbledhja = a+b;
        double zbritja = a-b;
        double shumzimi = a*b;
        double pjestimi = a/b;
        double modulusi = a%b;

        System.out.printf("Mledhja e numrave    %s + %s = %s \n", a, b, mbledhja);
        System.out.printf("Zbtrijta e numrave   %s - %s = %s \n", a, b, zbritja);
        System.out.printf("Shumzimi i numrave   %s * %s = %s \n", a, b, shumzimi);
        System.out.printf("Pjestimi i numrave   %s / %s = %s \n", a, b, pjestimi);
        System.out.printf("Modulusi eshte       %s mod %s = %s \n", a, b, modulusi);

//        System.out.printf("Mledhja e numrave    : %5d   +       %5d = %6d", a, b, mbledhja);
//        System.out.printf("Zbtrijta e numrave   : %5d   -       %5d = %6d", a, b, zbritja);
//        System.out.printf("Shumzimi i numrave   : %5d   *       %5d = %6d", a, b, shumzimi);
//        System.out.printf("Pjestimi i numrave   : %5d   /       %5d = %6d", a, b, pjestimi);
//        System.out.printf("Modulusi eshte       : %5d   mod     %5d = %6d", a, b, modulusi);
    }
}
