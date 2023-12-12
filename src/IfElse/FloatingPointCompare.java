package IfElse;

public class FloatingPointCompare {
    public static void main(String[] args) {
        System.out.println(Math.random()); // 0.6442753020356062

        if(0.644 == 0.6442753020356062) {
            System.out.println("Ketu nuk hin kushti");
        }
        else {
            System.out.println("Gjithmone printohet");
        }

        double toleranca = 0.001;
        if (Math.abs(0.644 - 0.6442753020356062) <= toleranca) {
            System.out.println("Ketu hin kushti");
        }
        else  {
            System.out.println("Kjo nuk printohet");
        }

    }
}
