package forLoops;

public class SumNumbersWithFor {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        int des = 0;

        // mbledhja e numrave deri tek ai numer i dhene:
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        // zbritja e numrave deri tek ai numer i dhene:
        // 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
        for (int i = 1; i <= number; i++) {
            sum = sum - i;
        }
        System.out.println(sum);
    }
}
