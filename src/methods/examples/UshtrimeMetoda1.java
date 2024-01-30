package methods.examples;

import java.util.Locale;

public class UshtrimeMetoda1 {
    public static void main(String[] args) {
        printOk();
        print("Hello World!");
        zbritDhePrinto(2, 1);
        double zbritja = zbrit(2, 1);
        printAlphabet();
    }

    public static void printOk() {
        System.out.println("OK");
    }

    public static void print(String message) {
        System.out.printf("Message is: %s", message);
    }

    public static void zbritDhePrinto(double numOne, double numTwo) {
        double result = numOne - numTwo;
        print(result);
    }

    public static double zbrit(double numOne, double numTwo) {
        return numOne - numTwo;

    }

    public static void print(double message) {
        System.out.println("Message is: " + message);
    }

    public static void printAlphabet() {
        for (char i = 65; i <= 90; i++) {
            System.out.println(i);
        }
    }

    public static void printAlphabet(boolean toLowerCase) {
//        for (char i = 65; i <= 90; i++) {
        // example 1
//            if (toLowerCase) {
//                System.out.println(i + 32);
//            } else {
//                System.out.println(i);
//            }


        // example 2
        for (char i = 65; i <= 90; i++) {
            String charInString = String.valueOf(i);

            if (toLowerCase) System.out.println(charInString.toLowerCase());
            else System.out.println(charInString);
        }
    }
}



