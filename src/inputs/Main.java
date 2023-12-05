package inputs;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // System.out => output (me marr te dhenen nga aplikacioni)
        // System.in => input (me dhene vlere ne aplikacion)


        // System.in
//        System.out.print("Shkruani nje karakter: ");
//        int inputOne = System.in.read();
//        System.out.println(inputOne);
//        System.out.println((char) inputOne);


        // scanner
        // example 1:
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter username: ");
//
//        String username =  myObj.nextLine();
//        System.out.println("Username is: " + username);


        // scanner (functions)
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Write: ");
//        boolean myInput = scanner.nextBoolean();
//        byte myInput = scanner.nextByte();
//        double myInput = scanner.nextDouble();
//        String myInput = scanner.nextLine();

        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        String d = scanner.nextLine();


        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//        System.out.println(myInput);

    }
}