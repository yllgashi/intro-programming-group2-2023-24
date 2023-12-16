package switch_syntax;

public class SwitchDanger {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Numri eshte 1");
//                break;
            case 2:
                System.out.println("Numri eshte 2");
//                break;
            case 3:
                System.out.println("Numri eshte 3");
//                break;
            default:
                System.out.println("Numri nuk eshte i menaxhuar ne menyren me te mire");
                break;
        }


//        Numri eshte 2
//        Numri eshte 3
//        Numri nuk eshte i menaxhuar ne menyren me te mire
    }
}
