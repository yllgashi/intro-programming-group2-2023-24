package methods;

public class MethodOverloading {
    // Method signature is made of: method name, return type and parameters order
    // We need to change them in order to handle method-overload (chaning method name is not considered)

    public static void main(String[] args) {

    }


    // different parameter orders (same method name)
    public static int getMyNumber() {
        return 1;
    }

    public static int getMyNumber(int number) {
        return 1;
    }

    public static int getMyNumber(long number) {
        return 1;
    }

    public static int getMyNumber(byte number) {
        return 1;
    }

    public static int getMyNumber(short number) {
        return 1;
    }

    public static int getMyNumber(int a, long b) {
        return 1;
    }

    public static int getMyNumber(long b, int a) {
        return 1;
    }



    // different method name
    public static void printTextOne() {
        System.out.println("Text 1");
    }

    public static void printTextTwo() {
        System.out.println("Text 2");
    }
}
