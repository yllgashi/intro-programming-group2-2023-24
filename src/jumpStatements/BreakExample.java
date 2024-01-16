package jumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        // break
        for (int i = -2; i < 5; i++) {
            if (i == 0) {
                continue;
            }
            System.out.println(10 / i);
        }
    }
}
