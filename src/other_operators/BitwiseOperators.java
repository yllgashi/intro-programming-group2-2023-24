package other_operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        /*
        Bitwise operators can be applied to the integer types, long, int, short,char, and byte
        Be aware: bitwise operatos and boolean operators are not the same:
            1. Bitwise operators: are applied to integer types (in bit-level)
            2. Boolean operators: are applied to boolean types
         */


        /*
            7 => 0 1 1 1
            3 => 0 0 1 1
        */

        // AND
//        byte a = 7;
//        byte b = 3;
//        System.out.println(a & b);


        // OR
//        byte a = 7;
//        byte b = 3;
//        System.out.println(a | b);


        // XOR
//        byte a = 7;
//        byte b = 3;
//        System.out.println(a ^ b);


        // ~ (NOT)
//        byte a = 7;
//        System.out.println(~a);
        // WHY -8?
        // 7 => 0 0 0 0 0 1 1 1
        // -8=> 1 1 1 1 1 0 0 0 (first one is the sign bit (-128))


        // >> (SHIFT)
        // byte a = 8;
//        System.out.println(a >> 2); // SHIFT RIGHT
//        System.out.println(a << 2); // SHIFT LEFT

    }
}
