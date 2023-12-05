package ushtrime1;

import java.util.Scanner;

public class Ushtrime4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ekipi i pare: ");
        String clubOne = scanner.nextLine();

        System.out.print("Ekipi i dyte: ");
        String clubTwo = scanner.nextLine();


        System.out.print("Sa gola i ka dhene " + clubOne + ": ");
        int clubOneGoals = scanner.nextInt();

        System.out.print("Sa gola i ka dhene " + clubTwo + ": ");
        int clubTwoGoals = scanner.nextInt();

        System.out.println(clubOne + " - " + clubTwo + " " + clubOneGoals + ":" + clubTwoGoals);
        System.out.printf("%s - %s %s:%s", clubOne, clubTwo, clubOneGoals, clubTwoGoals);

    }
}
