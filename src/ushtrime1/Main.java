package ushtrime1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ushtrimi 1
//        System.out.println(7 + 2);
//        System.out.println("7" + "2");
//        System.out.println("7" + 2);
//        System.out.println("A" + 'C');
//        System.out.println(7 - 2);
//        System.out.println(7 * 2);
//        System.out.println(7 / 2);
//        System.out.println(7 % 2);
//        System.out.println('7' + 2);
//        System.out.println(2 + '7');
//        System.out.println('7');



        // Ushtrimi 2
//        int y = 2 * 5 * 5 + 3 * (5 + 7);
////        2 * 5 is 10;
//        System.out.println(y);
//
//        int x = 10 * 5 + 3 * 5 + 7;
//        // 3 * 5 is 15;
//        System.out.println(x);



        // Ushtrime String
//        int a = 10;
//        a = 20;
//        String b = "test";
//        b = "test1";


//        int x = 3;
//        int y = 5;
//        String point = "(" + x + "," + y + ")";
//        System.out.println(point);


//        String name = "Anda";
//
//        int length = name.length();
//
//        System.out.println(length);
//
//        char charOne = name.charAt(0);
//        char charTwo = name.charAt(1);
//        char charThree = name.charAt(2);
//        char charFour = name.charAt(3);
//        char charFifth = name.charAt(4); //gabim runtime

//        System.out.println(name);
//        System.out.println(charOne);
//        System.out.println(charTwo);
//        System.out.println(charThree);
//        System.out.println(charFour);



        // inputs

        // System.in



        // scanner example 2
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        //String input
        String name = myObj.nextLine();

        //Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        //Output input by user
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
    }
}




