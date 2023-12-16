package switch_syntax.practice;

import java.util.Scanner;

public class ChooseMenuExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("1 - File");
        System.out.println("2 - Edit");
        System.out.println("Tjeter - Exit");
        int option = reader.nextInt();


        switch (option) {
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }
}
