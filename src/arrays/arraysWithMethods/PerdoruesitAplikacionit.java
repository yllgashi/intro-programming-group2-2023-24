package arrays.arraysWithMethods;

import java.util.Objects;
import java.util.Scanner;

public class PerdoruesitAplikacionit {
    public static void main(String[] args) {
        // kerko numrin e perdoruesve ne aplikacion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruaj numrin e perdoruesve: ");
        int usersNumber = scanner.nextInt();
        scanner.nextLine();

        // krijo nje varg me aq perdorues
        String[] users = new String[usersNumber];

        // mbush aplikacionin me perdoruesit
        users = mbushPerdoruesit(users, scanner);

        // edito perdoruesin
        // ndryshoPerdoruesin(users, 1, "Testim Testeri");

        // fshij perdoruesin
        // fshijPerdoruesin(users, 2);

        // lexo perdoruesin
        // lexoPerdoruesin(users, "Filan Fisteku");

        // lexo perdoruesit (te gjithe)
        // printoPerdoruesit(users);

    }

    public static String[] mbushPerdoruesit(String[] users, Scanner scanner) {
        for (int i = 0; i < users.length; i++) {
            System.out.print("Emri i perdoruesit " + i + ": ");
            users[i] =  scanner.nextLine();
        }
        return users;
    }

    public static String ndryshoPerdoruesin(String[] users, int index, String newName) {
        if (index >= 0 && index < users.length) {
            users[index] = newName;
        } else {
            System.out.println("Indeksi nuk ekziston");
        }
    }

    public static void fshijPerdoruesin(String[] users, int index) {
        if (index >= 0 && index < users.length) {
            users[index] = "";
        } else {
            System.out.println("Indeksi nuk ekziston");
        }
    }

    public static void lexoPerdoruesin(String[] users, String userName) {
        boolean isRead = false;
        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i])) {
                System.out.println("Emri: " + users[i] + ", indeksi: " + i);
                isRead = true;
            }
        }

        if (!isRead) {
            System.out.println("Perdoruesi nuk u gjet");
        }
    }

    public static void printoPerdoruesit(String[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
