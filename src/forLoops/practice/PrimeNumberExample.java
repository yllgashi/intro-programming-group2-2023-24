package forLoops.practice;

import java.util.Scanner;

public class PrimeNumberExample {
    public static void main(String[] args) {
        // prime numbers should mod only with itself and 1
        // 1 and 2 are prime numbers (we know this info)

        Scanner reader = new Scanner(System.in);

        int prime = 1; // help variable
        System.out.println("Enter an integer: ");
        int x = reader.nextInt();

        if (x > 3) {
            for (int i = 2; i < x && prime == 1; i++) {
                // nese plotpjestohet me numer tjeter perpos vetes, atehere nuk eshte prime dhe "prime" merr vleren 0, ne te kunderten e mban vleren default "1"
                if (x % i == 0) {
                    prime = 0;
                }
            }


            switch (prime) {
                case 1:
                    System.out.println(x + " is prime number");
                    break;
                case 0:
                    System.out.println(x + " is not prime number");
                    break;
            }
        }
        // 1, 2, 3 jane prime
        else {
            System.out.println(x + " is prime number");
        }
    }
}
