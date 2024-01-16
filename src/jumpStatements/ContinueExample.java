package jumpStatements;

public class ContinueExample {
    public static void main(String[] args) {


        // continue
        for (int i = -2; i < 5; i++) {
            if (i == 0) {
                continue;
            }
            System.out.println(10 / i);
        }
    }
}
