package IfElse.practice;

import java.util.Scanner;

public class IfElseRangu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj nje numer");
        int num = reader.nextInt();

        if (num <= 10_000 && num >= -10_000) {
            System.out.println("Numri i perket rangut te dhene");
        } else {
            System.out.println("Numri eshte jashte rangut");
        }
    }
}
