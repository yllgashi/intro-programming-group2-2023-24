package switch_syntax;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Jepni nje numer: ");
        int number = reader.nextInt();

        switch (number) {
            case 1:
                System.out.println("Numri eshte 1");
                break;
            case 2:
                System.out.println("Numri eshte 2");
                break;
            default:
                System.out.println("Numri nuk eshte i menaxhuar ne menyren me te mire");
                break;
        }
    }
}
