package forLoops;

public class NestedForLoop {
    public static void main(String[] args) {
        // Example 1
//        for (int i = 0; i <= 3; i++) {
//            System.out.println("i = " + i);
//            for (int j = 1; j <= 2; j++) {
//                System.out.println(" j = " + j);
//            }
//        }


        // Example two
        int rows = 5;
        int columns = 4;

        for (int row = 1; row <= rows; row++) {

            for (int col = 1; col <= columns; col++) {
                System.out.print(col);
            }

            // System.out.println();
        }


        //
        // 10 rreshta
        for (int i = 1; i <= 10; i++) {

            // 10 kolona
            for (int j = 1; j <= 10; j++) {

            }

            // rresht i ri
            System.out.println();
        }
    }
}
