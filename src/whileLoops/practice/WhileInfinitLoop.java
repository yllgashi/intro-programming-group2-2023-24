package whileLoops.practice;

public class WhileInfinitLoop {
    public static void main(String[] args) {
//        int count = 0;
//        while (true) {
//            count++;
//            System.out.println(count);
//        }


        double num = 2.0;
        while (num != 0.0) {
            System.out.println(num);
            num -= 0.1;
        }
    }
}
