package ushtrime1;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Shkruani eurot: ");
        int eurot = scanner.nextInt();
        System.out.printf("Shkruani centet: ");
        int centet = scanner.nextInt();


        int parate = (eurot * 100) + centet;


        System.out.printf("%-10s = %2d %n", "2-euro", parate / 200);
//        System.out.println("2-euro = " + parate / 200);
        parate = parate % 200;
        System.out.printf("%-10s = %2d %n", "1-euro", parate / 100);
//        System.out.println("1-euro = " + parate / 100);
        parate = parate % 100;
        System.out.printf("%-10s = %2d %n", "50-cent", parate / 50);
//        System.out.println("1-euro = " + parate / 50);
        parate = parate % 50;
        System.out.printf("%-10s = %2d %n", "20-cent", parate / 20);
//        System.out.println("1-euro = " + parate / 20);
        parate = parate % 20;
        System.out.printf("%-10s = %2d %n", "10-cent", parate / 10);
//        System.out.println("1-euro = " + parate / 10);
        parate = parate % 10;
        System.out.printf("%-10s = %2d %n", "5-cent", parate / 5);
//        System.out.println("1-euro = " + parate / 5);
        parate = parate % 5;
        System.out.printf("%-10s = %2d %n", "1-cent", parate / 1);
//        System.out.println("1-euro = " + parate);
    }
}
