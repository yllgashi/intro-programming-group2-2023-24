package other_operators;

import java.util.Scanner;

public class BooleanLogicalUshtrime {
    public static void main(String[] args) {
        // Shkruani një program që pyet përdoruesin për moshën e tij. Përdorni operatorë logjikë për të kontrolluar nëse mosha është brenda një intervali të vlefshëm (p.sh., midis 18 dhe 65). Shfaq një mesazh që tregon nëse mosha është e vlefshme apo jo.
        Scanner scanner = new Scanner(System.in);
        int mosha = scanner.nextInt();

        // opsioni i pare
        String mesazhi = mosha >= 18 && mosha <= 65 ? "Mosha eshte e vlefshme" : "Mosha eshte e pavlefshme";

        // opsioni i dyte
        boolean maEMadheSe18 = mosha >= 18 ? true : false;
        boolean maEVogelSe65 = mosha <= 65 ? true : false;
        String mesazhiDyte = maEMadheSe18 && maEVogelSe65 ? "E vlefshme" : "E pavlefshme";

        // opsioni i trete
        boolean mesazhiTrete = mosha >= 18 && mosha <= 65;

        // opsioni i katert

        System.out.println(mesazhi);
    }
}
