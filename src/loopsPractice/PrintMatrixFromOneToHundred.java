package loopsPractice;

public class PrintMatrixFromOneToHundred {
    public static void main(String[] args) {
        // 10 rreshta
        for (int row = 1; row <= 10; row++) {
            
            if (row == 7) {
                continue;
            }
            // 10 kolona
            for (int col = 1; col <= 10; col++) {

                int value = (row - 1) * 10 + col;
                System.out.print(value + " ");

            }
            // rresht i ri
            System.out.println();

        }
    }
}




