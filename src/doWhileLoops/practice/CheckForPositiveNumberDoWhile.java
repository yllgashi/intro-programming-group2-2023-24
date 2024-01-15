package doWhileLoops.practice;

import java.util.Scanner;

public class CheckForPositiveNumberDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Write positive number: ");
            number = scanner.nextInt();
        }
        while (number <= 0);

        System.out.println("Congrats, positive number is: " + number);
    }
}
