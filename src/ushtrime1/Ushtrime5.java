package ushtrime1;
import java.util.Scanner;

public class Ushtrime5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ekipi vendos:");
        String ekipiVendas= myObj.nextLine();

        System.out.println("Ekipi musafir:");
        String ekipiMusafir = myObj.nextLine();

        System.out.println("Numri i tifozeve:");
        int numriTifoz = myObj.nextInt();

        System.out.println("Fusha/Arena:");
        myObj.nextLine();
        String fusha = myObj.nextLine();

        System.out.println("Sa gola ka shenuar " + ekipiVendas + ":");
        int golatVendase = myObj.nextInt();

        System.out.println("Sa gola ka shenuar " + ekipiMusafir + ":");
        int golatMusafire = myObj.nextInt();

        System.out.println("----------------------------------------");

        System.out.println("Rezultati perfundimtar:");

        System.out.println(ekipiVendas + "-"+ ekipiMusafir + ":\t" + golatVendase + "-" + golatMusafire );

        System.out.println("Stadiumi " + fusha+ " me gjithsej " +numriTifoz+ " spektatore prezent.");

        System.out.println("----------------------------------------");


    }
}
