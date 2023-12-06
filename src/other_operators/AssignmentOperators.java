package other_operators;

public class AssignmentOperators {
    public static void main(String[] args) {
//        int a = 10; // vlera mund te jepet ne menyre dinamike (nuk kemi njohuri sa mund te merr)
//
//        // detyre (vleres te "a" te i shtohet vlera 4)
//        a = 10 + 4; // kjo na ben kur e dijm vleren e "a";
//        System.out.println(a);
//
//        a = a + 4; // kjo na ben kur NUK e dijm vleren e "a";
//        System.out.println(a);


        int a = 10;
        a = a + 10;
        a += 10; // compound assignment


        int b = 10;
        b = b - 10;
        b -= 10; // compound assignment


        int c = 10;
        c = c * 10;
        c *= 10; // compound assignment


        // assign multiple variables
        int x, y, z;
        x = y = z = 100; // set x, y, and z to 100
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
