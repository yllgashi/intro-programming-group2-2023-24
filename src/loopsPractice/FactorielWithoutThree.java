package loopsPractice;

public class FactorielWithoutThree {
    public static void main(String[] args) {
        int result = 1;
        int factorielNumber = 10; // e dhene nga perdoruesi

        for (int i = factorielNumber; i >= 1; i--) {
            if (i == 3) {
                continue;
            }

            System.out.println("Shumezimi me " + i);
            result *= i;
        }

        System.out.println(result);
    }
}
