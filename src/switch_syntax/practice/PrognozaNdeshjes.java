package switch_syntax.practice;

import java.util.Scanner;

public class PrognozaNdeshjes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prognoza = "";

        System.out.print("Ekipi pare: ");
        String firstClub = scanner.nextLine();

        System.out.print("Ekipi dyte: ");
        String secondClub = scanner.nextLine();


//        1 – per fitore te ekipit vendas (gjithmon 1 nese eshte Real Madrid-I si vendas)
//        X – per barazim
//        2 – per fitore te ekipit musafir  (gjithmon 2 nese eshte Real Madrid-I si musafir)
        System.out.print("Zgjedh rezultatin: ");
        char result = scanner.next().charAt(0);

        switch (result) {
            case '1':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton ekipi %s",
                        firstClub, secondClub, firstClub);
//                prognoza = "se fiton ekipi " + firstClub;
                break;
            case 'X':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se barazojne",
                        firstClub, secondClub, firstClub);
//                prognoza = "se ekipet barazojne";
                break;
            case '2':
                System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton ekipi %s",
                        firstClub, secondClub, secondClub);
//                prognoza = "se fiton ekipi " + secondClub;
                break;
            default:
                System.out.println("Nuk eshte menaxhuar kjo prognoze");
//                prognoza = "gabim";
                break;
        }

//        System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte %s",
//                firstClub, secondClub, prognoza);
    }
}
