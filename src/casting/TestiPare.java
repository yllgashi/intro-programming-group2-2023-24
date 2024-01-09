package casting;

import java.util.Scanner;

public class TestiPare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Të barabarta");
        } else {
            System.out.println("Jo të barabarta");
        }
    }
}


