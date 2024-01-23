package methods;

public class MethodExample {
    // Metoda duhet te krijohet mbrenda scope te klases
    public static void main(String[] args) {
        // Thirrja e metodes
        /*
            Input (parameters) -> double a, double b
            Output (result) -> double
         */
        Math.pow(2, 2);


        // Ekzekutimi i metodes te definuar nga ne:
        int maxNumber = findMaxNumber(1, 2);
        printMaxNumber(maxNumber);

        // Metodat jane te riperdorshme (reusable)  
        int maxNumber2 = findMaxNumber(3, 4);
        printMaxNumber(maxNumber2);
    }


    public static int findMaxNumber(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    public static void printMaxNumber(int maxNumber) {
        System.out.println("Numri maksimal eshte: " + maxNumber);
    }
}






