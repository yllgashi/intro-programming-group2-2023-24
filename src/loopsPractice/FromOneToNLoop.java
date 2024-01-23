package loopsPractice;

import java.util.Scanner;

public class FromOneToNLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj numrin: ");
        int number = scanner.nextInt();

        System.out.println("-------------------------");
        System.out.println("using for-loop");
        System.out.println("-------------------------");

        // for
        for (int i = 1; i <= 100; i++) {
            if (i > number) {
                break;
            }
            System.out.println(i);
        }


        System.out.println("-------------------------");
        System.out.println("using while-loop");
        System.out.println("-------------------------");

        // while
        int i = 0;
        while (i <= 100) {
            i++;
            if (i > number) {
                break;
            }
            System.out.println(i);
        }


        System.out.println("-------------------------");
        System.out.println("using do-while-loop");
        System.out.println("-------------------------");


        // do while
        i = 0;
        do {
            i++;
            if (i > number) {
                break;
            }
            System.out.println(i);
        } while (i <= 100);
    }
}
