package methods;

public class EndingAMethod {
    public static void main(String[] args) {

    }

    public static void calculateSomething() {
        System.out.println("test");
    }

    public static void calculateSomethingOne() {
        if (1 == 1) return;
        System.out.println("test");
    }

    public static void calculateSomethingTwo() {
        double a = 10 / 0;
        System.out.println("test");
    }
}
