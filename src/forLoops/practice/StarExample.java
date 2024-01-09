package forLoops.practice;

public class StarExample {
    public static void main(String[] args) {
        int number = 5;
        
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();









//        for (int i = number; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
