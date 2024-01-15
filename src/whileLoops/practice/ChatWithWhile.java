package whileLoops.practice;

import java.util.Scanner;

public class ChatWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personOneText = "";
        String personTwoText = "";
        final String STOP_KEYWORD = "stop";

        while (!    (personOneText.equals(STOP_KEYWORD) && personTwoText.equals(STOP_KEYWORD))  ) {
            System.out.print("Personi1: ");
            personOneText = scanner.nextLine();

            System.out.print("Personi2: ");
            personTwoText = scanner.nextLine();
        }
    }
}
