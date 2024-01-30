package methods;

public class MixedMethodCallings {
    public static void main(String[] args) {
        findEvenNumbers();
    }

    static void findEvenNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) printNumberInConsole(i);
        }
    }

    static void printNumberInConsole(int number) {
        System.out.println("Even: " + number);
    }

    static void showNumberInGUI(int number) {
        // GUI code
    }
}
