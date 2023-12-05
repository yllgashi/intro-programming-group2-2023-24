package constants;

// variable - variabile, ndryshore (mund te nderrohet vlera)
// constant - vlere konstante, (nuk mund te i nderrohet vlera)
public class ConstantExample {
    public static void main(String[] args) {

        // variable
        //        int a = 10;
        //        System.out.println(a);

        //        a = 20;
        //        System.out.println(a);


        // constants - nuk nderrohet vlera
        final int MIN_YEAR_FOR_WORK = 18;
        System.out.println(MIN_YEAR_FOR_WORK);
        //MIN_YEAR_FOR_WORK = 20; // nuk mundesh te e nderrosh vleren eshte finale (jep gabim sintaksor)


        final double PI = 3.14;
        System.out.println(PI);
    }
}
