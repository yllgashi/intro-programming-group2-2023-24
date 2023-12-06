package other_operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // expression1 ? expression2 : expression3
        // condition ? condition is true : condition is false

        // 100 pike => Kaloi
        // 0-99 pike => Nuk kaloi
        int piket = 100;

        String result = piket >= 100 ? "Kaloi" : "Nuk kaloi";
        System.out.println(result);
    }
}
