package forLoops.practice;

public class PrintStringWithFor {
    public static void main(String[] args) {
        String name = "Naim Sulejmani";
        String nameUpperCase = name.toUpperCase();

        for (int i = 0; i < nameUpperCase.length(); i ++) {
            System.out.println(nameUpperCase.charAt(i));
        }

        System.out.println();

        for (int i = nameUpperCase.length() - 1; i >=0; i --) {
            System.out.println(nameUpperCase.charAt(i));
        }
    }
}
