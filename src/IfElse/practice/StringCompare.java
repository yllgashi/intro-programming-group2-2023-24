package IfElse.practice;

public class StringCompare {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "ABC";

        // ==
        // jo e rekomandueshme (ndalohet sepse nuk eshte tip primitiv)
        if (a == b) {
            System.out.println("Te barabarta");
        }

        // .equals
        // e rekomandueshme
        if (a.equals(b)) {
            System.out.println("Te barabarta");
        }


        // compareTo
        // 0 --> Te njejta
        // < --> Nese String i pare eshte me i vogel
        // > --> Nese String i pare eshte me i madh
        if (a.compareTo(b) == 0) {
            System.out.println("Te barabarta");
        }

        if (a.compareTo(c) < 0) {
            System.out.println("A ma e vogel se C");
        }

        if (a.compareTo(c) > 0) {
            System.out.println("A ma e madhe se C");
        }
    }
}