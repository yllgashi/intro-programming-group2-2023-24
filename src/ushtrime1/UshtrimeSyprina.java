package ushtrime1;

import java.util.Scanner;

public class UshtrimeSyprina {
    public static void main(String[] args) {
        //Syprina e trekendeshit  A = 1/2 × b × h

//        Scanner scanner = new Scanner(System.in);
//        //Syprina e trekendeshit
//        final double konstanta = 0.5;
//        double b ;
//        double h;
//        double S;
//
//        System.out.print("Shkruani brinjen b:");
//        b= scanner.nextDouble();
//
//        System.out.print("Shkruani lartesine h:");
//        h= scanner.nextDouble();
//
//        //Kalkulimi
//        S = konstanta * b * h;
//        System.out.println("S = 1/2 * b * h =" + S);





        // Syprina e katrorit S = a^2
//         Scanner scanner= new Scanner(System.in);
//
//         char syprina, brinja;
//         syprina= 'S';
//         brinja= 'a';
//         double a;
//         double s;
//
//
//         System.out.println("Formula per syprinen e katrorit eshte: " + syprina + " = " + brinja + " * " + brinja);
//         System.out.println("Per te njehesuar syprinen e katrorit shtypni vleren e brinjes: ");
//         System.out.println("Gjatesia e brinjes: ");
//         a = scanner.nextDouble();
//         System.out.println("Gjatesia: " +a + "cm");
//
//         // Kalkulimi
//         s = Math.pow(a, 2);
//         System.out.println("Syprina e katrorit eshte: " + syprina + "=" + s + "cm");
//






         // Syprina e drejtkendeshit S = a * b
//         Scanner myInput = new Scanner(System.in);
//
//         System.out.println("Formula per syprinen e drejtkendeshit eshte a * b");
//         double a;
//         double b;
//
//         System.out.println("Shkruani brinjen a: ");
//         a = myInput.nextDouble();
//
//         System.out.println("Shkruani brinjen b: ");
//         b = myInput.nextDouble();
//
//         //Kalkulimi
//         double S = a * b;
//         System.out.println("Syprina e drejtkendeshit eshte: " + S +"cm");





         // Syprina e rrethit S = r^2 * PI
//         Scanner scanner = new Scanner(System.in);
//         final double PI = 3.14;
//         double r;
//
//         System.out.println("Jepni vleren e rrezes");
//         r = scanner.nextDouble();
//
//         double s = Math.pow(r , 2) * PI;
//         double s1 = r * r * PI;
//         System.out.println("Syprina e rrethite eshte: " + s);



        // Te gjendet hipotenuza  c  e trekendeshit kendedrejte kur dihen katetet a dhe b
//        Scanner scanner = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Shkruani brinjen a:");
//        a = scanner.nextDouble();
//
//        System.out.print("Shkruani brinjen b:");
//        b = scanner.nextDouble();
//
//        // Kalkulimi
//        c= Math.sqrt(Math.pow(a,2)+ Math.pow(b, 2));
////        System.out.println("c= math.sqrt(a^2 + b^2)" + c);
//        System.out.println("C = sqrt(a^2 + bb^2) =>" + c);



        // Te gjendet vellimi i kubit kur dihet brinja a;
        Scanner myObj = new Scanner(System.in);
        double a;

        System.out.println("Jepni vleren e brinjes a: ");
        a = myObj.nextDouble();

        double v = Math.pow(a , 3);
        System.out.println("Vellimi i kubit eshte: " + v);
    }
}






