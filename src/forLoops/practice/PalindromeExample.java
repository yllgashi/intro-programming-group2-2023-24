package forLoops.practice;

public class PalindromeExample {
    public static void main(String[] args) {
        String text = "asdasdasdadasdasdasdasdasdasqwdsdad";
        boolean itsPalindrome = true;
        int lastIndex = text.length() - 1;

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(lastIndex - i)) {
                itsPalindrome = false;
            }
        }

        System.out.println(itsPalindrome);
    }
}
