package ushtrime1;

import java.util.Scanner;

public class Ushtrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write name: ");
        String name = scanner.nextLine();

        System.out.print("Write age: ");
        int age = scanner.nextInt();

        System.out.println("My name is: " + name + ", age: " + age);
        System.out.printf("My name is: %s, age: %s", name, age);
    }
}
