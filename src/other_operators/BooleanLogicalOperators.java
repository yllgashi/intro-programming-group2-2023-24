package other_operators;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        // &
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a & b);

        // |
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a | b);


        // ^
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a ^ b);


        // !
//        boolean a = true;
//        System.out.println(!a);


//        // || (short-circuit)
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a || b);


        // && (short-circuit)
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a && b);

        // kombinimi i operatoreve te krahasimit dhe operatoreve logjik boolean
//        int fatlindAge = 18;
//        int arifAge = 19;
//        System.out.println(fatlindAge == arifAge | fatlindAge <= arifAge);




        // Perdorimi i short-circuit
//        System.out.println(1 / 2 == 2 && 1 / 0 == 1);
//        System.out.println(1 / 2 == 2 & 1 / 0 == 1);
//
        System.out.println(2 / 2 == 1 || 1 / 0 == 1);
        System.out.println(2 / 2 == 2 | 1 / 0 == 1);
    }
}
