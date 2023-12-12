package IfElse;

public class IfScopeExample {
    public static void main(String[] args) {
        int a = 10;

        if(true)
        {
            a = 20;
            int t = 10;
        }
        if (true) {
            int t = 20;
        }
        else  {
            int t = 30;
        }
    }
}
