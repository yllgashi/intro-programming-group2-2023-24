package arrays;

public class CardsExampleWithArrays {
    /*
    Te krijohen 4 letrat bixhozi
 */
    public static void main(String[] args) {
    /*
        Menyra e pare (e vjeter)
    */
//        String letra1 = "A#";
//        String letra2 = "2#";
//        String letra3 = "3#";
//        String letra4 = "4#";
//        System.out.println(letra1);
//        System.out.println(letra2);
//        System.out.println(letra3);
//        System.out.println(letra4);




        /*
            Menyra e dyte
            Te lehtesohet kodi me larte:
         */
        String[] letrat = new String[4];
//        letrat[0] = "A#";
//        letrat[1] = "2#";
//        letrat[2] = "3#";
//        letrat[3] = "4#";


        for (int i = 0; i < letrat.length; i++) {
            if (i == 0) {
                letrat[i] = "A#";
            } else {
                letrat[i] = i + 1 + "#";
            }
        }

//        System.out.println(letrat[0]);
//        System.out.println(letrat[1]);
//        System.out.println(letrat[2]);
//        System.out.println(letrat[3]);

        for (int i = 0; i < letrat.length; i++) {
            System.out.println(letrat[i]);
        }
    }
}
