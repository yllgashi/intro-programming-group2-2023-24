package arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // Mund te krijohet array i qfaredo tipi (primitiv ose reference)
        int[] intArray = new int[10];
        byte[] byteArray = new byte[10];
        double[] doubleArray = new double[20];
        String[] stringArray = new String[10];

        /*
            Llojet e inicializimit
         */
        // Menyra e pare
        int[] intArrayOne = new int[3];
        intArrayOne[0] = 1;
        intArrayOne[1] = 2;
        intArrayOne[2] = 3;

        // Menyra e dyte
        int[] intArrayTwo;
        intArrayTwo = new int[3];
        intArrayTwo[0] = 1;
        intArrayTwo[1] = 2;
        intArrayTwo[2] = 3;

        // Menyra e trete
        int[] intArrayThree = {1, 2, 3};

        /*
            Gjera interesante te arrays
         */
        int[] intArrayFour = new int[10];
        System.out.println(intArrayFour[1]); // shfaqet vlera default per "int" = 0
        // System.out.println(intArrayFour[11]); // error (out of array bounds)

        /*
            Vetite e arrays
            .length
         */
        // Rasti 1
        int[] intArrayFive = new int[10];
        System.out.println(intArrayFive.length);

        // Rasti 2
        Scanner scanner = new Scanner(System.in);
        int userArrayLength = scanner.nextInt();

        int[] intArraySix = new int[userArrayLength];
        System.out.println(intArraySix.length);

        /*
            String
         */
        char[] charArrayOne = new char[2];
        charArrayOne[0] = 'A';
        charArrayOne[1] = 'B';

        String myString = "AB";



        /*
            Collection without fixed-size
         */
//        List<Integer> listaMeGjatesiDinamike = new ArrayList<Integer>();
    }

}