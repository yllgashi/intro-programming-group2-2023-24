package methods;

import methods.practice.MathExample.MathExampleMethods;

public class StaticMethods {
    public static void main(String[] args) {
        String text = "abcd";

        text.length(); // metode e objektit (ne nivel te objektit) - Jo static

        String.valueOf(1); // metode e klases (ne nivel te klases) - Static
    }
}
