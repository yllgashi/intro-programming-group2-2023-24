package methods.practice.MathExample;

public class MathExampleMethods {
    static double pow(double a, double b) {
        return a * b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double abs(double number) {
        if (number < 0) return -number;
        else return number;
    }
}
