package IfElse;

public class ScopeExampleOne {
    public static void main(String[] args) {
        int a = 10;

        {
            int b = 20;
        }

        System.out.println(a);
//        System.out.println(b); // nuk e sheh scope
    }
}
