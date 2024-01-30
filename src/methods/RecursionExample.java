package methods;

public class RecursionExample {
    public static void main(String[] args) {
        // example 1
        int result = findFactoriel(5);
        System.out.println(result);

        // example 2
        printNumberInRow(3);

        // example 3 (stack overflow)
        // createStackOverflow(1);

        // example 4
        printNumberUntilZero(3);
    }


    public static void printNumberInRow(int number) {
        // if number == 1 then return to the call which is made from the same method
        // and continue execution until method end
        if (number == 0) {
            return;
        } else {
            // this will print "3 2 1"
            System.out.printf("%d ", number);

            // call it-self
            printNumberInRow(number - 1);

            // code will be continue to execute from there after last method-calling-itself process (after number has reached 1)
            // this will print "1 2 3"
            System.out.printf("%d ", number);
        }

    }


    // method which calls it-self (but it should have a case when calling-itself should stop)
    // in this example we stop if number is equal to 1 (if we don't add this condition then we are making smth like "infinit-loop")
    public static int findFactoriel(int number) {
        // if number which is given or called by the same method is "1" then return the result to the previous call in stack
        if (number == 1) {
            return number;
        } else {
            // call the same method
            return number * findFactoriel(number - 1);
        }
    }

    public static int createStackOverflow(int number) {
        // call the same method
        return number * createStackOverflow(number - 1);
    }

    public static void printNumberUntilZero(int number) {
        if (number == 0) {
            return;
        } else {
            System.out.println(number);
            printNumberUntilZero(number - 1);
        }
    }
}



