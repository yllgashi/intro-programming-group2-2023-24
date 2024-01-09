package forLoops.practice;

public class DetyreMatriceFor {
    public static void main(String[] args) {
        int number = 6;

        for (int i = 1; i <= number; i++){
            for (int j = 1; j <=10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
