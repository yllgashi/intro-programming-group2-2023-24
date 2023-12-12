package IfElse.practice;

import java.util.Scanner;

public class IfElseSemafori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jepni nje vlere nga 1 deri 4: ");
        byte numri = scanner.nextByte();

        if (numri == 1) {
            System.out.println("Semafori eshte i kuq!");
        } else if (numri == 2) {
            System.out.println("Semafori eshte i verdhe!");
        } else if (numri == 3) {
            System.out.println("Semafori eshte i gjelbert!");
        } else if (numri == 4) {
            System.out.println("Semafori eshte duke blinkuar!");
        } else {
            System.out.println("Kjo e dhene nuk ekziston");
        }
    }
}
