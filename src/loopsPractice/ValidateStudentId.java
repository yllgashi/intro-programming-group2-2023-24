package loopsPractice;

import java.util.Scanner;

public class ValidateStudentId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userId = "";
        boolean cond1;
        boolean cond2;

        do {
            System.out.print("Shkruaj ID: ");
            userId = scanner.nextLine();
            cond1 = userId.length() < 7;
            cond2 = userId.length() > 10;
        }
        while (userId.length() < 7 || userId.length() > 10);
    }
}
