package forLoops.practice;

public class PalindromeExample {
    public static void main(String[] args) {
        String text = "kimik";
        boolean itsPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) itsPalindrome = false;
        }

        System.out.println(itsPalindrome);
    }
}
