package casting;

import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {

        // [0, 1)
//        double randomNumber = Math.random();
//        System.out.println(randomNumber);


        // gjetja e nje numri random te plote duke perdorur Math.random()
        // Bad example
//        int numerIPloteRandom = (int) Math.random(); // gjithmon na kthen 0 (per shkak konvertimit)
//        System.out.println(numerIPloteRandom);

        // Correct example
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani nje numer: ");
        int a = scanner.nextInt();
        double r = Math.random();

        int numriPloteRandom = (int) (a * r);
        System.out.println(numriPloteRandom);
    }
}
