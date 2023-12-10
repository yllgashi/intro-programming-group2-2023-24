package other_operators;

import java.util.Scanner;

public class BitwiseUshtrime {
    public static void main(String[] args) {
        // Shkruani një program Java që merr dy numra të plotë si hyrje nga përdoruesi dhe kryen një operacion AND dhe një operacion OR në bit. Shfaq rezultatet.
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        System.out.println(a & b);
//        System.out.println(a | b);

//        Krijoni një program që merr një numër të plotë si hyrje dhe kryen ndërrime bit majtas dhe djathtas në të. Lejo përdoruesin të përcaktojë numrin e pozicioneve për të zhvendosur. Printoni rezultatet
//        Scanner scanner = new Scanner(System.in);
////        int numri = scanner.nextInt();
////        int pozicionePerTeZhvendosut = scanner.nextInt();
////
////        System.out.println(numri >> pozicionePerTeZhvendosut);
////        System.out.println(numri << pozicionePerTeZhvendosut);


//        Shkruani një program për të shkëmbyer dy numra të plotë pa përdorur një ndryshore të përkohshme (temp). Përdorni operatorë bit për të arritur shkëmbimin.
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
