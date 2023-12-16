package switch_syntax;

public class SwitchCompareToIfElse {
    public static void main(String[] args) {
        int number = 5;

        // Rasti me If-Else
        if (number == 1) {
            System.out.println("Numri eshte 1");
        } else if (number == 2) {
            System.out.println("Numri eshte 2");
        } else {
            System.out.println("Numri nuk eshte i menaxhuar ne menyren me te mire");
        }

        // Rasti me switch
        switch (number) {
            case 1:
                System.out.println("Numri eshte 1");
                break;
            case 2:
                System.out.println("Numri eshte 2");
                break;
            default:
                System.out.println("Numri nuk eshte i menaxhuar ne menyren me te mire");
                break;
        }
    }
}
