package IfElse.practice;

import java.util.Scanner;

public class GjetjaNotes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Jepni piket e provimit: ");
        int points = reader.nextInt();
        int nota = 0;

        if (points >= 0 && points <= 49) {
            nota = 5;
        } else if (points >= 50 && points <= 59) {
            nota = 6;
        } else if (points >= 60 && points <= 69) {
            nota = 7;
        } else if (points >= 70 && points <= 79) {
            nota = 8;
        } else if (points >= 80 && points <= 89) {
            nota = 9;
        } else if (points >= 90 && points <= 100) {
            nota = 10;
        } else {
            System.out.println("Piket gabim");
        }


        if (nota != 0) {
            System.out.printf("Nota eshte %d", nota);
        }

    }
}
