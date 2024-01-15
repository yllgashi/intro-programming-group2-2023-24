package whileLoops.practice;

public class PrintNumbersWhile {
    public static void main(String[] args) {
         int counter = 0;

         // with while
         while (counter < 100) {
             counter++;
             System.out.println(counter);
             System.out.println(Math.pow(counter, 2));

             // print odd
             if(counter % 2 == 1) System.out.println(counter);
         }

         // 100
        System.out.println(counter);

         // with for
         for (int i = 0; i <= 100; i++) {
             System.out.println(i);
             System.out.println(Math.pow(i, 2));

             // print odd
             if(counter % 2 == 1) System.out.println(i);
         }

         // error
//        System.out.println(i);
    }
}
